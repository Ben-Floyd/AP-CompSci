package com.floyd.Ch6.homework;

import java.util.Scanner;

public class SixPointTwoQOne {
	public static void main(String[] args){ 
		Scanner scan = new Scanner(System.in); 
			System.out.print("Input a positive intiger: "); 
			int in = scan.nextInt(); 
			int sum = 0; 

			for(int i = 1; i <= in; i++){ 
				sum += i; 
			} 
			System.out.println("Sum with a for loop " + sum); 
			
			int x = 1;
			sum = 0;
			while(x <= in) { 
				sum += x; 
				x++; 
			} 
			System.out.println("Sum with a while loop " + sum); 
			
			x = 1; 
			sum = 0;
			do{ 
				sum += x; 
				x++;
			} while(x <= in);
			System.out.println("Sum with a do while loop " + sum); 
		} 
}
