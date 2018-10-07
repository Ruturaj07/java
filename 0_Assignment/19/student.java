import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;

public class student extends JFrame implements ActionListener{

	JLabel Lname,Lroll_no,Lmarks;
	JTextField Tname,Troll_no,Tmarks;
	JButton insert,display,delete,update;
	Statement statement;
	String url = "jdbc:mysql://localhost/studentData";
	String username = "root";
	String password = "target";
	Connection connection = null;

	public student() {
		Lname = new  JLabel("Enter Name : ");
		Lroll_no = new JLabel("Enter Roll No. : ");
		Lmarks = new JLabel("Enter Marks");
		Tname = new JTextField(10);
		Troll_no = new JTextField(10);
		Tmarks = new JTextField(10);
		insert = new JButton("Insert");
		display = new JButton("Display");
		delete = new JButton("Delete");
		update = new JButton("Update");

		add(Lname);
		add(Tname);
		add(Lroll_no);
		add(Troll_no);
		add(Lmarks);
		add(Tmarks);
		add(insert);
		add(display);
		add(delete);
		add(update);

		setLayout(new FlowLayout());
		setTitle("Student Data");
		setSize(250, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		insert.addActionListener(this);
		display.addActionListener(this);
		delete.addActionListener(this);
		update.addActionListener(this);
	}

	public static void main(String[] args) {
		student s = new student();
	}


	public void actionPerformed(ActionEvent e) {
	
		try {

			//DB CONNECTION
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, username, password);
			System.err.println("connected");
			statement = connection.createStatement();

			//GETTING DATA
			String name = Tname.getText();
			String roll_no = Troll_no.getText();
			String marks = Tmarks.getText();


			//SELECT WHERE
			ResultSet rs = null;
			rs = statement.executeQuery("SELECT * FROM Records WHERE roll_no="+roll_no+" ;");


			//CHECKING DATA IS ALREADY EXISTS OR NOT
			boolean isAlreadyInserted = true;
			if(!(rs.isBeforeFirst())) {
			isAlreadyInserted = false;
			};


			//INSERT
			if(e.getSource()==insert) {

				if(isAlreadyInserted) {
					//USER ALREADY EXISTS
					JOptionPane.showMessageDialog(getParent(), "Student Data Already Exists", "WARNING", JOptionPane.WARNING_MESSAGE);
				}

				else {
					String query = "INSERT INTO Records(name,roll_no,marks) VALUES (\""+
								name +"\","+roll_no+","+marks+");";
					statement.execute(query);
					JOptionPane.showMessageDialog(getParent(), "Student Data Inserted", "INSERT", JOptionPane.OK_OPTION);
				}
			}

			//		DISPLAY
			if(e.getSource()==display) {

				if(!isAlreadyInserted) {
					//				USER NOT FOUND
					JOptionPane.showMessageDialog(getParent(), "Student Data Does NOT Exist", "WARNING", JOptionPane.WARNING_MESSAGE);
				}

				else {
					while(rs.next()) {
						System.out.println(rs.getString(1));
						System.out.println(rs.getInt(2));
						System.out.println(rs.getFloat(3));
						String oString = "STUDENT DATA\nName : "+rs.getString(1)+"\nRoll No. : "+rs.getInt(2)+"\nMarks : "+rs.getFloat(3)+"\n";
						JOptionPane.showMessageDialog(getParent(), oString, "DISPLAY", JOptionPane.OK_OPTION);
					}
				}
			}

			//		DELETE
			if(e.getSource()==delete) {
			
				if(isAlreadyInserted) {
					String query = "DELETE FROM Records WHERE roll_no = " +roll_no +";";
					statement.execute(query);
					JOptionPane.showMessageDialog(getParent(), "Student Data Deleted", "DELETE", JOptionPane.OK_OPTION);
				}
			
				else {
					//			USER NOT FOUND
					JOptionPane.showMessageDialog(getParent(), "Student Data Does NOT Exist", "WARNING", JOptionPane.WARNING_MESSAGE);
				}
			}

			//		UPDATE
			if(e.getSource()==update) {

				if(isAlreadyInserted) {
					String query = "UPDATE Records SET name=\""+name+"\", roll_no="+roll_no+", marks ="+marks+" WHERE roll_no = "+roll_no+";";
					statement.execute(query);
					JOptionPane.showMessageDialog(getParent(), "Student Data Updated", "UPDATE", JOptionPane.OK_OPTION);
				}

				else {
					//				USER NOT FOUND
					JOptionPane.showMessageDialog(getParent(), "Student Data Does NOT Exist", "WARNING", JOptionPane.WARNING_MESSAGE);
				}
			}

			//		CLOSE RESOURCES
			statement.close();
			connection.close();
		}

		// HANDLING EXCEPTIONS
		catch (SQLException e2) {
			e2.printStackTrace();
		}
		catch (Exception err) {
		System.err.println("not connected");
		}
	}
}