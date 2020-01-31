package com.floyd.Ch2.homework;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class NameComponent extends JComponent{
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g){
		//recover graphics
		Graphics2D g2 = (Graphics2D) g;
		
		//creates and draws a rectangle in blue
		Rectangle r = new Rectangle(200, 200, 100, 100);
		g2.setColor(Color.blue);
		g2.draw(r);
		
		//draw name in red
		g2.setColor(Color.red);
		g2.drawString("Ben Floyd", 230, 250);
		
		
	}
}
