package iii.reverseString;



import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class revStr extends JFrame implements ActionListener{
	JTextField str , res;
	JLabel Lstr,Lres;
	JButton result;
	public revStr() {
		// TODO Auto-generated constructor stub
		Lstr = new JLabel("Enter String : ");
		str = new JTextField(10);
		Lres = new JLabel("Reversed    	: ");
		res = new JTextField(10);
		result =new  JButton("RESULT");
		add(Lstr);
		add(str);
		add(Lres);
		add(res);
		add(result);
		result.addActionListener(this);
		setTitle("String Reverser");
		setSize(300, 300);
		setLayout(new FlowLayout());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		revStr f = new revStr(); 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String aString = str.getText();
		StringBuilder ip1 = new StringBuilder();
		ip1.append(aString);
		ip1 = ip1.reverse();
		String finalres = ip1.toString();
		res.setText(finalres);
	}

}
