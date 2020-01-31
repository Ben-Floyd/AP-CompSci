package com.floyd.ch7.homework;

public class Lab7_1 {

	public static void main(String[] args) {
		double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
		double total = 0;
		double min = x[0];
		int minPos = 0;
		
		for(double values: x){
			total += values;
		}
		System.out.println("enhanced for loop total: " + total);
		
		total = 0;
		for(int i = 0; i < x.length; i++){
			total += x[i];
		}
		System.out.println("standard for loop total: " + total);
		
		for(double values: x){
			if(values < min)
				min = values;
		}
		System.out.println("minimum value in x: " + min);
		
		min = x[0];
		for(int i = 1; i < x.length; i++){
			if(x[i] < min){
				min = x[i];
				minPos = i;
			}
		}
		System.out.println("minimum value in x: " + min + " at index " + minPos);
	}
}