package ii.jcompo;

import javax.swing.JButton;
import javax.swing.JFrame;

public class jcompodemo extends JFrame{
//	JButton jButton;
	actualcompo comp = new actualcompo();
	public jcompodemo() {
		// TODO Auto-generated constructor stub
//		jButton = new JButton("HBABS");
//		add(jButton);
		add(comp);
		pack();
		setTitle("JCOMPONENT");
//		setSize(400, 400);
//		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jcompodemo j = new jcompodemo();
	}

}
