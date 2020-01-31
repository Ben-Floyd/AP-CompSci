package com.floyd.Test;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

enum Marking {blank, X, O};

public class TicTacToe{
	private static final long serialVersionUID = 1L;
	private TicTacToeComponent component;
	private JFrame frame;
	private boolean turn = true;

	TicTacToe(){
		component = new TicTacToeComponent();
		frame = new JFrame();
		frame.setSize(465, 490);
		frame.setLocationRelativeTo(null);
		frame.setTitle("TIC TAC TOE");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//public functions
	public void init(){
		frame.add(component);
		frame.setVisible(true);
	}
	
	public void run(){
		frame.addMouseListener(new MouseListener(){
			public void mouseClicked(MouseEvent e) {
				component.setMarking(e.getPoint(), turn);//sets the marking
				frame.repaint();
				turn = !turn;//changes who's turn it is
				if(component.checkGame() == 1) {
					component.setWinner(1);
					frame.repaint();
					frame.removeMouseListener(this);
				} else if(component.checkGame() == 2){
					component.setWinner(2);
					frame.repaint();
					frame.removeMouseListener(this);
				}
			}

			public void mouseEntered(MouseEvent arg0) {}//do nothing

			public void mouseExited(MouseEvent arg0) {}//do nothing

			public void mousePressed(MouseEvent arg0) {}//do nothing

			public void mouseReleased(MouseEvent arg0) {}//do nothing
		});
	}
	
	
}
