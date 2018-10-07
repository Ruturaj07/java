
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

import javax.swing.*;

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
		
		String msg = tf2.getText();
		chatString+=(ssays+msg);
		tf1.setText(chatString);
		try {
			dout.writeUTF(ssays+msg);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		
	}
	public void infiniteReciever() {
		while(true) {
			String msgrcvd="";
			try {
				msgrcvd = din.readUTF();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			chatString+=msgrcvd;
			tf1.setText(chatString);
		}
	}

}
