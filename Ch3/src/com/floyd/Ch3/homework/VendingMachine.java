package com.floyd.Ch3.homework;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class VendingMachine {
	private static final int maxCans = 20;
	
	//Instance Variables
	private int cans, coins;
	private JFrame frame = new JFrame();
	private VendingMachineComponent component = new VendingMachineComponent();
	private JButton buyBtn = new JButton("Buy");
	private JButton fillBtn = new JButton("Fill");
	private JButton getCansBtn = new JButton("Get Cans");
	private JButton getCoinsBtn = new JButton("Get Coins");
	
	//Constructors
	public VendingMachine(){
		cans = 10;
		coins = 0;
		frame.setSize(500, 500);
		frame.setName("Vending Machine");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buyBtn.setBounds(375, 200, 75, 25);
		fillBtn.setBounds(375, 150, 75, 25);
		getCansBtn.setBounds(375, 250, 100, 25);
		getCoinsBtn.setBounds(375, 300, 100, 25);
	}
	
	public VendingMachine(int cans){
		this.cans = cans;
		coins = 0;
		frame.setSize(500, 500);
		frame.setName("Vending Machine");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buyBtn.setBounds(375, 200, 75, 25);
		fillBtn.setBounds(375, 150, 75, 25);
		getCansBtn.setBounds(375, 250, 75, 25);
		getCoinsBtn.setBounds(375, 350, 75, 25);
	}
	
	//Private functions
	private void fill(int cans){
		this.cans += cans;
		if(cans > maxCans){this.cans = maxCans;}
		component.setCans(this.cans);
		component.repaint();
	}
	
	private void buy(){
		if(cans > 0){
			cans--;
			coins++;
			component.setCans(cans);
			System.out.println("can bought");
		} else {
			System.out.println("Out of Cans");
			return;
		}
		component.repaint();
	}
	
	//public functions
	public int getCans(){
		return cans;
	}
	
	public int getCoins(){
		return coins;
	}
	
	public void init(){
		component.add(buyBtn);
		component.add(fillBtn);
		component.add(getCansBtn);
		component.add(getCoinsBtn);
		component.setCans(cans);
		frame.add(component);
		frame.setVisible(true);
	}
	
	public void run(){
		frame.repaint();
		buyBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				buy();
			}
		});
		fillBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				fill(maxCans - cans);
			}
		});
		getCansBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println(getCans() + " Cans");
			}
		});
		getCoinsBtn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println(getCoins() +  " Coins");
			}
		});
	}
}
