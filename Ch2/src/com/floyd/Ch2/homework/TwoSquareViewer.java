package com.floyd.Ch2.homework;

import javax.swing.JFrame;

public class TwoSquareViewer {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		frame.setSize(500, 500);
		frame.setTitle("Two Rectangles");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		TwoSquareComponent component = new TwoSquareComponent();
		frame.add(component);
		
		frame.setVisible(true);
	}
}
