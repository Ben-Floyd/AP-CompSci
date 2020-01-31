package com.floyd.Ch2.homework;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

/**
 * A component that draws two rectangles with the same center
 */
public class TwoSquareComponent extends JComponent{
	private static final long serialVersionUID = 1L;
	
	public void paintComponent(Graphics g) {
		
		//recover graphics
		Graphics2D g2 = (Graphics2D) g;
		
		//construct a rectangle and draw it
		Rectangle r = new Rectangle(200, 200, 50, 50);
		g2.draw(r);
		
		Rectangle r2 = new Rectangle(190, 190, 70, 70);
		g2.draw(r2);
	}
}
