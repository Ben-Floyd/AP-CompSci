package ch8.two.homework.six;

public class Cube {
	private double size;
	
	public Cube(double size){
		this.size = size;
	}
	
	public double volume(){
		double volume = Math.pow(size, 3);
		return volume;
	}
	
	public double surface(){
		double surface = size * size * 6.0;
		return surface;
	}
}
