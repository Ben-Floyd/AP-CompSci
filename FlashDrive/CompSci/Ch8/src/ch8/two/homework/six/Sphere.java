package ch8.two.homework.six;

public class Sphere {
	private double radius;
	
	public Sphere(double radius) {
		this.radius = radius;
	}
	
	public double volume(){
		double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
		return volume;
	}
	
	public double surface(){
		double surface = 4 * Math.PI * Math.pow(radius, 2);
		return surface;
	}
}
