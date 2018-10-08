package i.click;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class clicker extends JFrame implements ActionListener{
	JTextField textField;
	JButton jButton;
	int clicks=0;
	clicker(){
		textField = new JTextField(5);
		jButton = new JButton("CLICK ME!!!");
		textField.setText("0");

		add(textField);
		add(jButton);
		jButton.addActionListener(this);
		setTitle("CLICKER");
		setSize(400, 400);
		setLayout(new FlowLayout());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		clicker cli = new clicker(); 
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		clicks++;
		String string = Integer.toString(clicks);
		textField.setText(string);
	}

}
