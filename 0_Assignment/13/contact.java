import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

public class contact extends JFrame implements ActionListener{

	JTextField tf1,tf2;
	JLabel lb1,lb2;
	JButton jb1,jb2;
	JTextArea ta1;

	public contact(){
		lb1 = new JLabel("Name   :");
		tf1 = new JTextField(20);
		lb2 = new JLabel("Number:");
		tf2 = new JTextField(20);
		jb1 = new JButton("Add");
		jb2 = new JButton("View");
		ta1 = new JTextArea(20,20);
		add(lb1);
		add(tf1);
		add(lb2);
		add(tf2);
		add(jb1);
		add(jb2);
		add(ta1);
	jb1.addActionListener(this);	
		jb2.addActionListener(this);

	setSize(300,900);  
    setLayout(new FlowLayout());  
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);  
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
			String str = "Name :"+name+"\nNumber:"+num+"\n";
			try{stream.write(str.getBytes());}
			catch(Exception err){}
		}
		try{stream.close();}
		catch(Exception err){}
	
		}
		if(e.getSource()==jb2){
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

	}

	public static void main(String a[]){
		contact c = new contact();
	}
}
