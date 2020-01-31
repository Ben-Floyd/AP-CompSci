package ch8.two.homework.six;

public class Cone {
	private double radius, height;
	
	public Cone(double radius, double height){
		this.height = height;
		this.radius = radius;
	}
	
	public double volume(){
		double volume = Math.PI * Math.pow(radius, 2) * height / 3.0;
		return volume;
	}
	
	public double surface(){
		double surface = Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
		return surface;
	}
}
