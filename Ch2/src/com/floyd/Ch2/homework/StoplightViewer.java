package com.floyd.Ch2.homework;

import javax.swing.JFrame;

enum Light {red, yellow, green}

public class StoplightViewer {
	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame();
		int time = 0;
		
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Stoplight");
		frame.setVisible(true);
		
		StoplightComponent componentRed = new StoplightComponent(Light.red);
		StoplightComponent componentYellow = new StoplightComponent(Light.yellow);
		StoplightComponent componentGreen = new StoplightComponent(Light.green);
		
		while (true){
			if (time == 0){
				frame.remove(componentRed);
				frame.add(componentGreen);
			}else if(time == 1){
				frame.remove(componentGreen);
				frame.add(componentYellow);
			}else if(time == 2){
				frame.remove(componentYellow);
				frame.add(componentRed);
			}
			frame.revalidate();
			frame.repaint();
			System.out.println(time);
			time = (time + 1) % 3;
			Thread.sleep(3000);
		}
	}
}
