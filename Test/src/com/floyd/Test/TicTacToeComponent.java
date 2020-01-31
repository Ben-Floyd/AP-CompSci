package com.floyd.Test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

import javax.swing.JComponent;

public class TicTacToeComponent extends JComponent {
	private static final long serialVersionUID = 1L;
	
	//instance variables
	private Graphics2D g2;
	private int winner;
	private Point[][] boxes = new Point[3][3]; {//coordinates of the grids
		boxes[0][0] = new Point(0, 0);//row 1 column 1
		boxes[0][1] = new Point(150, 0);
		boxes[0][2] = new Point(300, 0);
		boxes[1][0] = new Point(0, 150);
		boxes[1][1] = new Point(150, 150);
		boxes[1][2] = new Point(300, 150);
		boxes[2][0] = new Point(0, 300);
		boxes[2][1] = new Point(150, 300);
		boxes[2][2] = new Point(300, 300);
	}
	private Marking[][] grid = new Marking[][] {//2D array of the grid markings
			{Marking.blank, Marking.blank, Marking.blank},
			{Marking.blank, Marking.blank, Marking.blank},
			{Marking.blank, Marking.blank, Marking.blank}
	};
								
	//public methods
	
	public void paintComponent(Graphics g){//draws everything
		 g2 = (Graphics2D) g;
		
		//draw grid
		g2.setColor(Color.BLACK);
		g2.drawLine(150, 0, 150, 450);
		g2.drawLine(300, 0, 300, 450);
		g2.drawLine(0, 150, 450, 150);
		g2.drawLine(0, 300, 450, 300);
		
		for(int y = 0; y < grid.length; y++){
			for(int x = 0; x < grid[y].length; x++){
				switch(grid[y][x]){
					case X:
						drawX(boxes[y][x]);
						break;
					case O:
						drawO(boxes[y][x]);
					default:
						break;
				}
			}
		}
		
		if(winner == 1){
			g2.setColor(Color.RED);
			g2.setFont(new Font("MONOSPACED", Font.BOLD, 30));
			g2.drawString("Player 1 Wins!", 125, 225);
		} else if(winner == 2){
			g2.setColor(Color.RED);
			g2.setFont(new Font("MONOSPACED", Font.BOLD, 30));
			g2.drawString("Player 2 Wins!", 125, 225);
		}
	}
	
	public void setMarking(Point click, boolean player){//sets the grid marking to x
		int x;
		int y;
		
		//finds x box
		if (click.x < 180){
			x = 0;
		} else if(click.x < 330){
			x = 1;
		} else if(click.x < 500) {
			x = 2;
		} else {return;}
		
		//finds y box
		if (click.y < 180){
			y = 0;
		}
		else if(click.y < 330){
			y = 1;
		}
		else if(click.y < 500) {
			y = 2;
		} else {return;}
		
		if (player && (grid[y][x] == Marking.blank)){ //is it player 1's turn
			grid[y][x] = Marking.X;
		} else if(grid[y][x] == Marking.blank){
			grid[y][x] = Marking.O;
		} else {return;}
	}
	
	public byte checkGame(){
		if((grid[0][0] == Marking.X && grid[1][0] == Marking.X && grid[2][0] == Marking.X)//vertical for x on column 1
				|| (grid[0][1] == Marking.X && grid[1][1] == Marking.X && grid[2][1] == Marking.X)//vertical for x on column 2
				|| (grid[0][2] == Marking.X && grid[1][2] == Marking.X && grid[2][2] == Marking.X)//vertical for x on column 3
				|| (grid[0][0] == Marking.X && grid[0][1] == Marking.X && grid[0][2] == Marking.X)//horizontal for x on row 1
				|| (grid[1][0] == Marking.X && grid[1][1] == Marking.X && grid[1][2] == Marking.X)//horizontal for x on row 2
				|| (grid[2][0] == Marking.X && grid[2][1] == Marking.X && grid[2][2] == Marking.X)//horizontal for x on row 2
				|| (grid[2][0] == Marking.X && grid[1][1] == Marking.X && grid[0][2] == Marking.X)//diag for x bottom top
				|| (grid[0][0] == Marking.X && grid[1][1] == Marking.X && grid[2][0] == Marking.X)){//diag for x top bottom
			return 1;
		}
		
		if((grid[0][0] == Marking.O && grid[1][0] == Marking.O && grid[2][0] == Marking.O)//vertical for x on column 1
				|| (grid[0][1] == Marking.O && grid[1][1] == Marking.O && grid[2][1] == Marking.O)//vertical for o on column 2
				|| (grid[0][2] == Marking.O && grid[1][2] == Marking.O && grid[2][2] == Marking.O)//vertical for o on column 3
				|| (grid[0][0] == Marking.O && grid[0][1] == Marking.O && grid[0][2] == Marking.O)//horizontal for o on row 1
				|| (grid[1][0] == Marking.O && grid[1][1] == Marking.O && grid[1][2] == Marking.O)//horizontal for o on row 2
				|| (grid[2][0] == Marking.O && grid[2][1] == Marking.O && grid[2][2] == Marking.O)//horizontal for o on row 2
				|| (grid[2][0] == Marking.O && grid[1][1] == Marking.O && grid[0][2] == Marking.O)//diag for o bottom top
				|| (grid[0][0] == Marking.O && grid[1][1] == Marking.O && grid[2][0] == Marking.O)){//diag for o top bottom
			return 2;
		} else {
			return 0;
		}
	}
	
	public void setWinner(int player){
		winner = player;
	}
	
	//private methods
	private void drawX(Point cord) {//draws an  redX in the specified grid
		g2.setColor(Color.RED);
		g2.drawLine(cord.x, cord.y, cord.x + 150, cord.y + 150);
		g2.drawLine(cord.x, cord.y + 150, cord.x + 150, cord.y);
	}
	
	private void drawO(Point cord) { //draws a blue O in the specified grid
		g2.setColor(Color.BLUE);
		g2.drawOval(cord.x, cord.y, 150, 150);
	}
}
