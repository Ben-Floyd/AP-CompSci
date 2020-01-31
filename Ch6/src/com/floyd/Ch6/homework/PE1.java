package com.floyd.Ch6.homework;

import java.util.Scanner;

public class PE1 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		String input;
		byte digit;
		
		System.out.print("Input number: ");
		input = scan.next();
		
		for (int x = 0; x < input.length(); x++){
			digit =  Byte.parseByte(Character.toString(input.charAt(x)));
			if (digit % 2 != 0){
				sum += digit;
				System.out.println(digit);
			}
		}
		System.out.print(sum);
	}
}
