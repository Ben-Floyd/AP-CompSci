package com.floyd.Ch2.homework;

import javax.swing.JFrame;

public class NameViewer {
	public static void main(String[] args) {
		//creates window
		JFrame frame = new JFrame();
		
		//sets window options
		frame.setSize(500, 500);
		frame.setTitle("Name in Box");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//draws stuff
		NameComponent component = new NameComponent();
		frame.add(component);
		
		//displays window
		frame.setVisible(true);
	}

}
