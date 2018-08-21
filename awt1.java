import javax.swing.*;
public class awt1{
	public static void main(String a[]){
		simpleframe f = new simpleframe();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	class simpleframe extends JFrame{
		public simpleframe(){
			setSize(400,400);
		}
	}
} 