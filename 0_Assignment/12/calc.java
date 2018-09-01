/*Develop a Swing GUI based standard calculator program.*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class uicalc extends JFrame implements ActionListener{
	JLabel lb1,lb2;
	JTextField ip1,ip2,op;
	JButton sum;
	JFrame f;  

	public uicalc(){
   		f=new JFrame();//creating instance of JFrame  
		f.setTitle("Calcul");
		f.setSize(400,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lb1 = new JLabel("First Input : ");
		lb2 = new JLabel("First Input : ");
		ip1 = new JTextField(20);
		ip2 = new JTextField(20);
		op  = new JTextField(20);
		sum	= new JButton("Find Addition");
		f.add(lb1);
		f.add(ip1);
		f.add(lb2);
		f.add(ip2);
		f.add(sum);
		f.add(op);
		sum.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		int a = Integer.parseInt(ip1.getText());
		int b = Integer.parseInt(ip2.getText());
		int c = a+b;
		op.setText(String.valueOf(c));
	}
}

class calc{
	public static void main(String a[]){
		uicalc s = new uicalc();
	}
}
