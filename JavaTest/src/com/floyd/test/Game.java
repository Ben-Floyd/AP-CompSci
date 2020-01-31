package com.floyd.test;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Game extends JFrame implements Runnable {
	private static final long serialVersionUID = 1L;
	
	private Canvas canvas = new Canvas();
	private RenderHandler renderer;
	private BufferedImage image;

	public Game() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 800, 500);
		setLocationRelativeTo(null);
		add(canvas);
		setVisible(true);
		
		canvas.createBufferStrategy(3);
		
		renderer = new RenderHandler(getWidth(), getHeight());
		
		image = loadImage("God of Nature- Front.png");
	}
	
	public void update() {
		
	}
	
	private BufferedImage loadImage(String path) {
		BufferedImage loadedImage;
		BufferedImage formatedImage = null;
		try {
			loadedImage = ImageIO.read(Game.class.getResource(path));
			formatedImage = new BufferedImage(loadedImage.getWidth(), loadedImage.getHeight(), BufferedImage.TYPE_INT_RGB);
			formatedImage.getGraphics().drawImage(loadedImage, 0, 0, null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return formatedImage;
	}
	
	public void render(){
		BufferStrategy bufferStrategy = canvas.getBufferStrategy();
		Graphics graphics = bufferStrategy.getDrawGraphics();
		super.paint(graphics);
		
		renderer.renderImage(image, 100, 100);
		renderer.render(graphics);
		
		//switch buffers
		graphics.dispose();
		bufferStrategy.show();
	}
	
	public void run() {
		//BufferStrategy bufferStrategy = canvas.getBufferStrategy();
		final double spf = 1 / 60.0;//one sixtieth of a second per frame = 60 frames per second
		long lastTime = System.nanoTime();
		double nanoSecondConversion = 1000000000.0,
				changeInSeconds = 0; 
		
		while(true) {
			long now = System.nanoTime();
			
			changeInSeconds += (now - lastTime) / nanoSecondConversion; //60 frames per second
			
			while(changeInSeconds >= spf) {
				update();
				changeInSeconds = 0;
			}
			render();
			lastTime = now;
		}
	
	}
	
	public static void main(String[] arg0) {
		Game game = new Game();
		Thread gameThread = new Thread(game);
		gameThread.start();
	}
}