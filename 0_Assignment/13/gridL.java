
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class gridL extends JFrame implements ActionListener{

JButton i,ii,iii,iv,v,vi;
boolean flag=true;

public gridL(){
	i=new JButton("1");
	ii=new JButton("2");
	iii=new JButton("3");
	iv=new JButton("4");
	v=new JButton("5");
	vi=new JButton("6");
	add(i);
	add(ii);
	add(iii);
	add(iv);
	add(v);
	add(vi);
	setLayout(new GridLayout(3,2));
	setSize(400,400);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	i.addActionListener(this);
	ii.addActionListener(this);
	iii.addActionListener(this);
	iv.addActionListener(this);
	v.addActionListener(this);
	vi.addActionListener(this);
}

public static void main(String a[]){
	gridL gr = new gridL();
}

public void actionPerformed(ActionEvent e){
	if(flag){
	setLayout(new GridLayout(2,3));
	revalidate();
	flag=false;
	}
	else{
		setLayout(new GridLayout(3,2));
	revalidate();
	flag=true;
	}

}
}
