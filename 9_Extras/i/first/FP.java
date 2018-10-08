package i.first;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FP extends JFrame {
	JButton jb;
	FP(){
		jb = new JButton("Click Me");
		jb.setBounds(100, 100, 150, 20);
		add(jb);
		Image image = new ImageIcon("download.jpeg").getImage();
		setIconImage(image);
		setTitle("MY FIRST");
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		FP a = new FP();
	}

}
