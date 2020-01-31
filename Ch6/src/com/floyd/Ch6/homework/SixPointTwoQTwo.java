package com.floyd.Ch6.homework;

import java.util.Scanner;

public class SixPointTwoQTwo {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int total = 0, count = 0;
		boolean run = true;
		
		while(run){
			System.out.print("Input an intiger: ");
			if(!scan.hasNextInt()){
				run = false;
			}
			else{
				total += scan.nextInt();
				count++;
			}
			System.out.println("Total: " + total + "\nNumber of entries: " + count);
		}
	}
}
