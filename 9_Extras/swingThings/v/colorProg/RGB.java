package v.colorProg;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class RGB extends JFrame implements ActionListener{
	JButton jb1,jb2,jb3;
	JPanel jPanel;
	public RGB() {
		// TODO Auto-generated constructor stub
		jb1 = new JButton("YELLOW");
		jb2 = new JButton("RED");
		jb3 = new JButton("GREEN");
		jPanel = new JPanel();
		jPanel.add(jb1);
		jPanel.add(jb2);
		jPanel.add(jb3);
		add(jPanel);
		setTitle("COLOR ACTION");
		setSize(600, 600);
//		setLayout(FlowLayout);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jb1) {
			jPanel.setBackground(Color.YELLOW);
		}
		if(e.getSource()==jb2) {
			jPanel.setBackground(Color.RED);
		}
		if(e.getSource()==jb3) {
			jPanel.setBackground(Color.GREEN);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RGB rgb = new RGB();
	}

}
