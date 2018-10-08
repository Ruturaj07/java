package chat;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class client extends JFrame implements ActionListener{
	JTextArea tf1;
	JButton button;
	JTextArea tf2;
	static Socket socket;
	static DataInputStream din;
	static DataOutputStream dout;
	String chatString="THIS IS CLIENT";
	String csays = "\nClient Says :";
	
	
	
	public client() {
		// TODO Auto-generated constructor stub
		tf1 = new JTextArea(33, 52);
		add(tf1);
		tf1.setText(chatString);

		tf2 = new JTextArea(4,30);
		add(tf2);
		button = new JButton("SEND");
		add(button);
		setLayout(new FlowLayout());
		setTitle("CHAT");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		button.addActionListener(this);
		infiniteReciever();
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		socket = new Socket("localhost", 3000);
		System.out.println("Connected to Server");
		
		 din= new DataInputStream(socket.getInputStream());
		
		dout = new DataOutputStream(socket.getOutputStream());
		
		
		client s = new client();
		socket.close();
		din.close();
		dout.close();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String msg = tf2.getText();
		chatString+=(csays+msg);
		tf1.setText(chatString);
		try {
			dout.writeUTF(csays+msg);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public void infiniteReciever() {
		while(true) {
			String msgrcvd="";
			try {
				msgrcvd = din.readUTF();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			chatString+=msgrcvd;
			tf1.setText(chatString);
		}
	}

}