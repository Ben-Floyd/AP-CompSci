package com.floyd.Ch3.homework;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class VendingMachineComponent extends JComponent{
	private static final long serialVersionUID = 1L;
	
	private int numOfCans;
	
	public VendingMachineComponent(){
		numOfCans = 0;
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle machine = new Rectangle(50, 100, 300, 300);
		Rectangle window = new Rectangle(75, 150, 205, 185);
		Rectangle moneySlot = new Rectangle(290, 175, 45, 5);
		Rectangle door = new Rectangle(150 ,350, 75, 30);
		
		Rectangle[] btns = {new Rectangle(290, 200, 15, 15),//btn1
				new Rectangle(320, 200, 15, 15), //btn2
				new Rectangle(290, 230, 15, 15), //btn3
				new Rectangle(320, 230, 15, 15), //btn4
				new Rectangle(290, 260, 15, 15), //btn5
				new Rectangle(320, 260, 15, 15), //btn6
				new Rectangle(290, 290, 15, 15), //btn7
				new Rectangle(320, 290, 15, 15)}; //btn8
		
		//4 cans per row
		//6 cans per column
		Rectangle cans[] = {new Rectangle(80, 160, 45, 20),//1st can
							new Rectangle(130, 160, 45, 20),//2nd can
							new Rectangle(180, 160, 45, 20),//3rd can
							new Rectangle(230, 160, 45, 20),//4th can
							new Rectangle(80, 195, 45, 20),//5th can
							new Rectangle(130, 195, 45, 20),//6th can
							new Rectangle(180, 195, 45, 20),//7th can
							new Rectangle(230, 195, 45, 20),//8th can
							new Rectangle(80, 230, 45, 20),//9th can
							new Rectangle(130, 230, 45, 20),//10th can
							new Rectangle(180, 230, 45, 20),//11th can
							new Rectangle(230, 230, 45, 20),//12th can
							new Rectangle(80, 265, 45, 20),//13th can
							new Rectangle(130, 265, 45, 20),//14th can
							new Rectangle(180, 265, 45, 20),//15th can
							new Rectangle(230, 265, 45, 20),//16th can
							new Rectangle(80, 300, 45, 20),//17th can
							new Rectangle(130, 300, 45, 20),//18th can
							new Rectangle(180, 300, 45, 20),//19th can
							new Rectangle(230, 300, 45, 20)};//20th can
		
		g2.setBackground(Color.BLUE);
		
		g2.setColor(Color.DARK_GRAY);
		g2.fill(machine);
		
		g2.setColor(Color.ORANGE);
		g2.setFont(new Font("MONOSPACED", Font.BOLD, 30));
		g2.drawString("Vending Machine", 60, 125);
		
		g2.setColor(new Color(230, 230, 230));
		g2.fill(window);
		
		g2.setColor(Color.BLACK);
		g2.fill(moneySlot);
		g2.fill(door);
		
		for(int i = 0; i < btns.length; i++){
			g2.setColor(Color.LIGHT_GRAY);
			g2.fill(btns[i]);
			
			String num = Integer.toString(i + 1);
			
			g2.setColor(Color.BLACK);
			g2.setFont(getFont().deriveFont(10.0f));
			g2.drawString(num, (int) btns[i].getX() + 5, (int) btns[i].getY() + 10);
		}
		
		for(int i = 0; i < numOfCans; i++){
			g2.setColor(Color.RED);
			g2.fill(cans[i]);
			
			g2.setColor(Color.WHITE);
			g2.setFont(getFont().deriveFont(20.0f));
			g2.drawString("Can", (int) cans[i].getX() + 5, (int) cans[i].getY() + 15);
		}
	}
	
	public void setCans(int cans){
		numOfCans = cans;
	}
}
