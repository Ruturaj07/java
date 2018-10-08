
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LCR extends JFrame implements ActionListener{

JButton L,C,R;
JPanel jp1;

public LCR(){
	L=new JButton("L");
	C=new JButton("C");
	R=new JButton("R");
	jp1 = new JPanel();
	jp1.add(L);
	jp1.add(C);
	jp1.add(R);
	add(jp1);
	/*add(L);
	add(C);
	add(R);*/
	setLayout(new FlowLayout());
	setSize(400,400);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	L.addActionListener(this);
	C.addActionListener(this);
	R.addActionListener(this);
}

public static void main(String a[]){
	LCR lcr = new LCR();
}

public void actionPerformed(ActionEvent e){
	if(e.getSource()==L) {
		 setLayout(new FlowLayout(FlowLayout.LEFT));
		 revalidate();
	}
	if(e.getSource()==C) {
		setLayout(new FlowLayout(FlowLayout.CENTER));
		 revalidate();
	}
	if(e.getSource()==R) {
	setLayout(new FlowLayout(FlowLayout.RIGHT));
		 revalidate();
	
	}
}
}
