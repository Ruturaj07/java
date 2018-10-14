
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Cdemo extends JFrame implements ActionListener{
	
	JComboBox<String> jComboBox;
	BufferedImage img = null;
	ImageIcon icon=null;
	JLabel lbl=null;
	
	public Cdemo() {
		// TODO Auto-generated constructor stub
	
	String[] data = {"Jasmine","Rose","Lotus"};
	jComboBox = new JComboBox<>(data);
	add(jComboBox);
	add(new p());

    
	try {
		img = ImageIO.read(new URL("https://upload.wikimedia.org/wikipedia/commons/thumb/4/42/Common_Jasmine.jpg/220px-Common_Jasmine.jpg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    icon = new ImageIcon(img);
	
	lbl = new JLabel();
    lbl.setIcon(icon);
    add(lbl);
	
	setTitle("");
	setSize(400, 400);
	setVisible(true);
	setLayout(new FlowLayout());
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jComboBox.addActionListener(this);
	}

	class p extends JPanel{
		JTextField aField =new JTextField("asda");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Cdemo();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String data = jComboBox.getItemAt(jComboBox.getSelectedIndex());  
		if(data.equals("Rose")){
			try {
				img = ImageIO.read(new URL("https://upload.wikimedia.org/wikipedia/commons/thumb/e/e6/Rosa_rubiginosa_1.jpg/220px-Rosa_rubiginosa_1.jpg"));
			} catch (IOException err) {
				// TODO Auto-generated catch block
				err.printStackTrace();
			}
		    icon = new ImageIcon(img);
		    lbl.setIcon(icon);

		}
		if(data.equals("Lotus")){
			try {
				img = ImageIO.read(new URL("https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Nelumno_nucifera_open_flower_-_botanic_garden_adelaide2.jpg/220px-Nelumno_nucifera_open_flower_-_botanic_garden_adelaide2.jpg"));
			} catch (IOException err) {
				// TODO Auto-generated catch block
				err.printStackTrace();
			}
		    icon = new ImageIcon(img);
		    lbl.setIcon(icon);

		}
		if(data.equals("Jasmine")){
			try {
				img = ImageIO.read(new URL("https://upload.wikimedia.org/wikipedia/commons/thumb/4/42/Common_Jasmine.jpg/220px-Common_Jasmine.jpg"));
			} catch (IOException err) {
				// TODO Auto-generated catch block
				err.printStackTrace();
			}
		    icon = new ImageIcon(img);
		    lbl.setIcon(icon);

		}
	}

}
