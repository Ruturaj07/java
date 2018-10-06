package stationary;


import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class shopping extends JFrame implements ActionListener {
	JLabel l1;
	JCheckBox c1,c2,c3;
	JButton order;
	int notebooks,pens,pencils;
	int total=0;
	
	public shopping() {
		// TODO Auto-generated constructor stub
		l1 = new JLabel("Purchase Stationary");
		c1 = new JCheckBox("NOTEBOOK @ 50");
		c2 = new JCheckBox("PEN @ 30");
		c3 = new JCheckBox("PENCIL @ 20");
		order = new JButton("Order!!");
		
		add(l1);
		add(c1);
		add(c2);
		add(c3);
		add(order);
		
		setSize(400, 400);
		setTitle("AMAZONN");
		setLayout(new GridLayout(5,1));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		c1.addActionListener(this);
		c3.addActionListener(this);
		c2.addActionListener(this);
		order.addActionListener(this);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shopping s = new shopping();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==order) {
			total=0;
			if(c1.isSelected())
					total+=(notebooks*50);
			if(c2.isSelected())
				total+=(pens*30);
			if(c3.isSelected())
				total+=(pencils*20);
			String ordreditems = "Notebooks : "+notebooks+"\nPens : "+pens+"\nPencils : "+pencils+"\nTotal Amt : "+total;
			JOptionPane.showMessageDialog(getParent(), ordreditems, "ORDERED", JOptionPane.PLAIN_MESSAGE);
		}
		
		if(e.getSource()==c1) {
			if (c1.isSelected()) {		
//				System.out.println("c1 HAPPENDED");
				String temp = JOptionPane.showInputDialog("Enter Quantity of notebooks:");
				notebooks = Integer.parseInt(temp);
				
			}
		}
		if(e.getSource()==c2) {
			if (c2.isSelected()) {
//				System.out.println("c2 HAPPENDED");
				String temp = JOptionPane.showInputDialog("Enter Quantity of pens:");
				pens = Integer.parseInt(temp);
			}
		}if(e.getSource()==c3) {
			if (c3.isSelected()) {
//				System.out.println("c3 HAPPENDED");
				String temp = JOptionPane.showInputDialog("Enter Quantity of pencils:");
				pencils = Integer.parseInt(temp);
		
			}
		}
	
	
	}
	
	

}

