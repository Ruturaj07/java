package iii.drawing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

public class drawcompo extends JComponent{
	
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		Graphics2D graphics2d = (Graphics2D) g;
		graphics2d.setPaint(Color.RED);
		Rectangle2D rectangle2d = new Rectangle2D.Double(100, 100, 300, 400);
		graphics2d.draw(rectangle2d);
		graphics2d.fill(rectangle2d);
		Ellipse2D ellipse2d = new Ellipse2D.Double(150, 150, 150, 150);
		graphics2d.draw(ellipse2d);
		graphics2d.setPaint(Color.BLACK);

		graphics2d.fill(ellipse2d);
		Line2D line2d = new Line2D.Double(0, 0, 600, 600);
		graphics2d.draw(line2d);
	}
	
	public Dimension getPreferredSize() {
		// TODO Auto-generated method stub
		return new Dimension(600, 600);
	}
}
