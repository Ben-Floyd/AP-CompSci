package com.floyd.Ch2.homework;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class StoplightComponent extends JComponent{
	private static final long serialVersionUID = 1L;
	
	public Ellipse2D red = new Ellipse2D.Double(200, 25, 100, 100),
	  yellow = new Ellipse2D.Double(200, 175, 100, 100),
	  green = new Ellipse2D.Double(200, 325, 100, 100);
	
	Light state;
	
	public StoplightComponent(Light state){
		this.state = state;
	}
	
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(Color.darkGray);
		Rectangle stoplight = new Rectangle(150, 15, 200, 425);
		g2.fill(stoplight);
		
		switch(state) {
		case red:
			//on
			g2.setColor(Color.red);
			g2.fill(red);
			//off
			g2.setColor(Color.yellow.darker());
			g2.fill(yellow);
			g2.setColor(Color.green.darker());
			g2.fill(green);
			break;
		case yellow:
			//on
			g2.setColor(Color.yellow);
			g2.fill(yellow);
			//off
			g2.setColor(Color.red.darker());
			g2.fill(red);
			g2.setColor(Color.green.darker());
			g2.fill(green);
			break;
		case green:
			//on
			g2.setColor(Color.green);
			g2.fill(green);
			//off
			g2.setColor(Color.red.darker());
			g2.fill(red);
			g2.setColor(Color.yellow.darker());
			g2.fill(yellow);
			break;
		}
	}
}
