package com.floyd.Ch2.homework;

import java.awt.Point;

public class PointTester {
	public static void main(String[] args) {
		Point point1 = new Point(3, 4), point2 = new Point(-3, -4);
		double distance = point1.distance(point2);
		
		System.out.println("Expected Distance: " + 10 + "\nComputed Distance: " + distance);
	}

}
