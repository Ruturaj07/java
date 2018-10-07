//package contacts;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

public class contact extends JFrame implements ActionListener{

	JTextField tf1,tf2;
	JLabel lb1,lb2;
	JButton jb1,jb2,jb3;
	JTextArea ta1;
	JPanel create,view,realview;

	public contact(){
		lb1 = new JLabel("Name   :");
		tf1 = new JTextField(20);
		lb2 = new JLabel("Number:");
		tf2 = new JTextField(20);
		jb1 = new JButton("Add");
		jb2 = new JButton("VIEW CONTACTS");
		ta1 = new JTextArea(50,50);
		jb3 = new JButton("CREATE NEW CONTACT");
		realview = new JPanel();
		realview.add(jb3);
		create = new JPanel();
		create.add(lb1);
		create.add(tf1);
		create.add(lb2);
		create.add(tf2);
		create.add(jb1);
		create.setLayout(new GridLayout(3, 3));
		
		view = new JPanel();
		realview.add(jb2);
		
		add(realview);
		add(create);
		view.add(ta1);

		add(view);
		
		 jb1.addActionListener(this);	
		jb2.addActionListener(this);
		jb3.addActionListener(this);
	setSize(600,600);  
    setLayout(new FlowLayout());  
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true); 
    create.hide();
    view.hide();
	}

	public void actionPerformed(ActionEvent e) {
		File f = new File("CON.vcf");
		if(e.getSource()==jb1){
		String name = tf1.getText();
		String num  = tf2.getText();
		// System.out.println(name+num);
		FileOutputStream stream=null;
		try{
			stream = new FileOutputStream(f,true);
		}catch(Exception err){
		}
		if(f.exists())
		{
			String str = "Name :"+name+"\nNumber:"+num+"\n\n";
			try{stream.write(str.getBytes());}
			catch(Exception err){}
		}
		try{stream.close();}
		catch(Exception err){}
	
		}
		if(e.getSource()==jb2){
			create.hide();
			view.show();
			BufferedReader br =null;
			FileReader fin = null;
			try{
				fin = new FileReader(f);
				br = new BufferedReader(fin);
				String line,str;
				str="";
				while((line=br.readLine())!=null){
					str=str+line+"\n";
				}
				ta1.setText(str);
			}
			catch(Exception err){
			
			}
		try{fin.close();}
		catch(Exception err){}
		}
		if(e.getSource()==jb3) {
			create.show();
			view.hide();
		}
}
	

	public static void main(String a[]){
		contact c = new contact();
	}
}

