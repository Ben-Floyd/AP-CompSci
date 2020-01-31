package com.floyd.Ch1;

import java.util.Scanner;

public class HelloPrinter {

	public static void main(String[] arg0){
		Scanner reader = new Scanner(System.in);
		
		System.out.print("input number: ");
		int x = reader.nextInt();
		
		System.out.print("\n" + x);
	}
}
