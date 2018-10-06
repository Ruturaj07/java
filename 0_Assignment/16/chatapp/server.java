package chat;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class server extends JFrame implements ActionListener{
	JTextArea tf1;
	JButton button;
	JTextArea tf2;
	static ServerSocket serverSocket;
	static Socket socket;
	static DataInputStream din;
	static DataOutputStream dout;
	String chatString="THIS IS SERVER";
	String ssays = "\nServer Says : ";
	
	
	public server() {
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
		serverSocket = new ServerSocket(3000);
		System.out.println("Server started \nWaiting for connections");
		 socket=serverSocket.accept();
		System.out.println("Connected to client");
		 din= new DataInputStream(socket.getInputStream());
		
		dout = new DataOutputStream(socket.getOutputStream());
		
		
		server s = new server();
		socket.close();
		din.close();
		dout.close();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String msg = tf2.getText();
		chatString+=(ssays+msg);
		tf1.setText(chatString);
		try {
			dout.writeUTF(ssays+msg);
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
