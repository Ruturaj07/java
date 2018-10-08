package ii.jcompo;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;

public class actualcompo extends JComponent{
	
	public void paintComponent(Graphics g) {
		g.drawString("Ruturaj", 200, 200);
		
	}

	public Dimension getPreferredSize() {
		// TODO Auto-generated method stub
		return new Dimension(400,800);
	}
}
