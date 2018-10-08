import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class demo2 extends JFrame implements ActionListener{
	
	JLabel u,p;
	JTextField uname;
	JPasswordField passwordField;
	JButton register,login,exit;
	Statement statement;
	String url = "jdbc:mysql://localhost/studentLogin";
	String username = "root";
	String password = "ubuntu";
	Connection connection = null;
	
	public demo2() {
		// TODO Auto-generated constructor stub
		u= new JLabel("Username");
		add(u);
		uname= new JTextField(10);
		add(uname);
		p =new JLabel("Password");
		add(p);
		passwordField = new JPasswordField(10);
		add(passwordField);
		register = new JButton("Register");
		login = new JButton("Login");
		add(register);
		add(login); 
		
		setLayout(new FlowLayout());
		setTitle("Registratation");
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		register.addActionListener(this);
		login.addActionListener(this);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		demo2 n = new demo2();
	
				
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, password);
			System.err.println("connected");
			statement = connection.createStatement();
		} catch (Exception err) {
			// TODO: handle exception
			System.err.println("not connected");
		}
		
		String Tusername = uname.getText();
		String Tpassword = String.valueOf(passwordField.getPassword());
		ResultSet rs = null;
		try {
			 rs = statement.executeQuery("SELECT * FROM userpass WHERE user = \""+Tusername+"\"");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		if(e.getSource() == register) {
			
			try {
				if(!rs.next()) {
//					System.out.println("empty");
					String query = "INSERT INTO userpass(user,pass)"+
									" VALUES(\""+Tusername+"\","+
									"\""+Tpassword+"\");";
					statement.execute(query);
					JOptionPane.showMessageDialog(getParent(), "USER REGISTERED", "REGISTRATION COMPLETE", JOptionPane.WARNING_MESSAGE);

				}
				else {
//					System.out.println("User already Registered");
					JOptionPane.showMessageDialog(getParent(), "USER ALREADY REGISTERED", "WARNING", JOptionPane.WARNING_MESSAGE);
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		
		if(e.getSource() == login) {
			boolean flag = true;
			String realpass = null;
			
			try {
				if(!rs.next()) {
//					System.out.println("User not found");
					JOptionPane.showMessageDialog(getParent(), "USER NOT FOUND", "WARNING", JOptionPane.WARNING_MESSAGE);

					flag = false;
				}
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			
			if(flag) {
			try {
				//rs.next();
				realpass = rs.getString(2);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if(Tpassword.equals(realpass)) {
//				System.out.println("LOgged in");
				JOptionPane.showMessageDialog(getParent(), "LOGGED IN", "LOGIN COMPLETE", JOptionPane.WARNING_MESSAGE);

			}else {
//				System.out.println("Incorrect password");
				JOptionPane.showMessageDialog(getParent(), "INCORRECT PASSWORD", "WARNING", JOptionPane.WARNING_MESSAGE);

			}
			}
		}
		
		try {
			statement.close();
			connection.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}

