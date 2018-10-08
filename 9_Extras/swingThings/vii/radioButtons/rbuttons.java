package vii.radioButtons;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class rbuttons extends JFrame implements ActionListener{

	JRadioButton fe,se,te;
	ButtonGroup bGroup;
	JTextField tField ;
	JLabel lb1;
	
	public rbuttons() {
		// TODO Auto-generated constructor stub
		fe = new JRadioButton("FE");
		se = new JRadioButton("SE");
		te = new JRadioButton("TE");
		bGroup = new ButtonGroup();
		tField = new JTextField(5);
		lb1 = new JLabel("SELECTED BUTTON ");
		
		bGroup.add(fe);
		bGroup.add(se);
		bGroup.add(te);
		add(fe);
		add(se);
		add(te);
		add(lb1);
		add(tField);
		setTitle("RADIO BUTTONS");
		setSize(250, 250);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		fe.addActionListener(this);
		se.addActionListener(this);
		te.addActionListener(this);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rbuttons rb = new rbuttons(); 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(fe.isSelected()) {
			tField.setText("FE");
		}
		else if(se.isSelected()) {
			tField.setText("SE");
		}
		else if (te.isSelected()) {
			tField.setText("TE");
		}
		else {
			tField.setText("");
		}
	}

}
