
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class conv extends JFrame implements ActionListener{
	
	JLabel lnum,lres;
	JButton bin, oct,hex;
	JTextField num,res;
	JPanel jp1,jp2,jp3;
	
	public conv() {
		// TODO Auto-generated constructor stub
		lnum = new JLabel("Enter Number");
		lres = new JLabel("Result");
		bin = new JButton("BINARY");
		oct = new JButton("OCTAL");
		hex = new JButton("HEXADECIMAL");
		num = new JTextField(10);
		res = new JTextField(10);
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		
		jp1.add(lnum);
		jp1.add(num);
		add(jp1,BorderLayout.NORTH);
		
		jp2.add(bin);
		jp2.add(oct);
		jp2.add(hex);
		add(jp2, BorderLayout.CENTER);
		
		jp3.add(lres);
		jp3.add(res);
		add(jp3, BorderLayout.SOUTH);
		
		setTitle("BINARY OCTAL DECIMAL");
		setSize(400, 125);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		bin.addActionListener(this);
		oct.addActionListener(this);
		hex.addActionListener(this);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conv c = new conv();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int number = Integer.parseInt(num.getText());
		if(e.getSource()==bin) {
			res.setText(Integer.toBinaryString(number));
		}
		if(e.getSource()==oct) {
			res.setText(Integer.toOctalString(number));

		}
		if(e.getSource()==hex) {
			res.setText(Integer.toHexString(number).toUpperCase());
		}
		
	}

}

