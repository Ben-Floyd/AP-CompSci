package ch8.two.homework.six;

public class Cylinder {
	private double radius, height;
	
	public Cylinder(double radius, double height){
		this.height = height;
		this.radius = radius;
	}
	
	public double volume(){
		double volume = Math.PI * Math.pow(radius, 2) * height;
		return volume;
	}
	
	public double surface(){
		double surface = 2 * Math.PI * height * radius + 2 * Math.PI * Math.pow(radius, 2);
		return surface;
	}
}
