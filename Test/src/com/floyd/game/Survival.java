package com.floyd.game;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Survival extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private Screens screen = new Screens();
	private JPanel contentPane;
	private JTextArea txtArea;

	//constructor
	Survival(){
		setTitle("survivale");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		createWindow();
		setResizable(false);
		setVisible(true);	
	}
	
	public void start(){
		txtArea.addKeyListener(new KeyListener(){
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_1 || e.getKeyCode() == KeyEvent.VK_NUMPAD1){
					System.out.println("Flag5");
					txtArea.setText(screen.opening2);
				}
			}

			public void keyReleased(KeyEvent arg0) {
			}

			public void keyTyped(KeyEvent arg0) {
				//never triggered
			}
		});	
	}
	
	private void createWindow(){
		contentPane = new JPanel();
		setContentPane(contentPane);
		
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		txtArea = new JTextArea();
		GridBagConstraints gbc_txtArea = new GridBagConstraints();
		gbc_txtArea.fill = GridBagConstraints.BOTH;
		gbc_txtArea.gridx = 0;
		gbc_txtArea.gridy = 0;
		contentPane.add(txtArea, gbc_txtArea);
		
		txtArea.setEditable(false);
		txtArea.setLineWrap(true);
		txtArea.setFont(new Font("MONOSPACED", Font.BOLD, 23));
		txtArea.setForeground(Color.GREEN);
		txtArea.setBackground(Color.BLACK);
		txtArea.setText(screen.opening1);
	}
}
