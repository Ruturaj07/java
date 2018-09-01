    import java.awt.event.*;  
    import javax.swing.*;    
    public class Simple {  
    public static void main(String[] args) {  
        JFrame f=new JFrame("Calculator");

     	JLabel l1=new JLabel("Input 1 :");  
    	l1.setBounds(50,20, 100,30);  
        final JTextField tf1=new JTextField();  
        tf1.setBounds(50,50, 150,20); 

	
     	JLabel l2=new JLabel("Input 2 :");  
    	l2.setBounds(50,70, 100,30);  
 	final JTextField tf2=new JTextField();  
        tf2.setBounds(50,100, 150,20); 

	
     	JLabel l3=new JLabel("Output :");  
    	l3.setBounds(50,120, 100,30);  
 	final JTextField tf3=new JTextField();  
        tf3.setBounds(50,150, 150,20);

        JButton b1=new JButton("Add");  
        b1.setBounds(50,200,95,30);  

        b1.addActionListener(new ActionListener(){  
    	public void actionPerformed(ActionEvent e){  
		int a = Integer.parseInt(tf1.getText());
		int b = Integer.parseInt(tf2.getText());
		int c = a+b;
                tf3.setText(String.valueOf(c));  
            }  
        });  

	JButton b2=new JButton("Sub");  
        b2.setBounds(50,250,95,30);  

        b2.addActionListener(new ActionListener(){  
    	public void actionPerformed(ActionEvent e){  
		int a = Integer.parseInt(tf1.getText());
		int b = Integer.parseInt(tf2.getText());
		int c = a-b;
                tf3.setText(String.valueOf(c));  
            }  
        });

	JButton b3=new JButton("Mul");  
        b3.setBounds(50,300,95,30);  

        b3.addActionListener(new ActionListener(){  
    	public void actionPerformed(ActionEvent e){  
		int a = Integer.parseInt(tf1.getText());
		int b = Integer.parseInt(tf2.getText());
		int c = a*b;
                tf3.setText(String.valueOf(c));  
            }  
        });

	JButton b4=new JButton("Div");  
        b4.setBounds(50,350,95,30);  

        b4.addActionListener(new ActionListener(){  
    	public void actionPerformed(ActionEvent e){  
		int a = Integer.parseInt(tf1.getText());
		int b = Integer.parseInt(tf2.getText());
		double c = ((double)a)/b;
                tf3.setText(String.valueOf(c));  
            }  
        });




       f.add(l1);f.add(l2);f.add(l3);f.add(tf1);f.add(tf2);f.add(tf3);f.add(b1);f.add(b2);f.add(b3);f.add(b4);   
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);   
    }  
    }  

/*


*/
