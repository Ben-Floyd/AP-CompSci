package ch8.two.homework.six;

public class Test {
		
	public static void main(String[] args) {
		Cube cube = new Cube(5);
		Sphere sphere = new Sphere(5);
		Cylinder cylinder = new Cylinder(5, 4);
		Cone cone = new Cone(5, 4);
		
		System.out.println(cone.surface());
	}

}
