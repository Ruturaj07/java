    import java.awt.event.*;  
    import javax.swing.*;    
    public class square {  
    public static void main(String[] args) {  
        JFrame f=new JFrame("Square");

     	JLabel l1=new JLabel("Input 1 :");  
    	l1.setBounds(50,20, 100,30);  
        final JTextField tf1=new JTextField();  
        tf1.setBounds(50,50, 150,20); 
	
     	JLabel l3=new JLabel("Output :");  
    	l3.setBounds(50,120, 100,30);  
 	final JTextField tf3=new JTextField();  
        tf3.setBounds(50,150, 150,20);

        JButton b1=new JButton("Square");  
        b1.setBounds(50,200,95,30);  

        b1.addActionListener(new ActionListener(){  
    	public void actionPerformed(ActionEvent e){  
		int a = Integer.parseInt(tf1.getText());
		int c = a*a;
                tf3.setText(String.valueOf(c));  
            }  
        });  

	




       f.add(l1);f.add(l3);f.add(tf1);f.add(tf3);f.add(b1);
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);   
    }  
    }  

/*


*/
