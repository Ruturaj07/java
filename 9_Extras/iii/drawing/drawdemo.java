package iii.drawing;

import java.awt.Color;

import javax.swing.JFrame;

public class drawdemo extends JFrame{
	public drawdemo() {
		// TODO Auto-generated constructor stub
		drawcompo cDrawcompo = new drawcompo();
		add(cDrawcompo);
		
		pack();		
		setTitle("MY FIRST DRAWING");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		drawdemo nDrawdemo = new drawdemo();
	}

}
