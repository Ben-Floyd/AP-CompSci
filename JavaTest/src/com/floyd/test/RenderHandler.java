package com.floyd.test;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

public class RenderHandler {
	
	private BufferedImage view;
	private int[] pixels;
	
	public RenderHandler(int width, int height) {
		//creates a new buffered image that will represent our view
		view = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		
		//create an array of pixels
		pixels = ((DataBufferInt) view.getRaster().getDataBuffer()).getData();
		
		for(int y = 0; y < height; y++) {
			int randPixel = (int) (Math.random() * 0xffffff);
			
			for(int x = 0; x < width; x++){
				pixels[y * width + x] = randPixel;
			}
		}
	}
	
	//renders pixel array to the screen
	public void render(Graphics graphics) {
		
		graphics.drawImage(view, 0, 0, view.getWidth(), view.getHeight(), null);
	}
	
	//adds an image to the array of pixels
	public void renderImage(BufferedImage image,int xPos,int yPos) {
		int[] imgPixels = ((DataBufferInt) image.getRaster().getDataBuffer()).getData();
		for(int y = 0; y < image.getHeight(); y++) {
			for(int x = 0; x < image.getWidth(); x++) {
				pixels[(yPos + y) * view.getWidth() + xPos + x] = imgPixels[y * image.getWidth() + x];
			}
		}
	}
}
