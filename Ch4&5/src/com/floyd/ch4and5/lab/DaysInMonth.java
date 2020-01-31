package com.floyd.ch4and5.lab;

import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		byte month = 0;
		boolean isLeapYear = false, repeat  = false;
		
		do {
			repeat = false;
			System.out.print("What month is it(enter answer in a number 1-12: ");
			try {
				month = in.nextByte();
			} catch (java.util.InputMismatchException e) {
				in.next();
				System.out.print("Invalid data entry. Try Again.\n\n");
				repeat = true;
				continue;
			}
			
			if((month > 12) || (month < 1)) {
				System.out.print("Invalid data entry. Try Again.\n\n");
				repeat = true;
			}
		} while (repeat);
		
		
		switch(month) {
			case 1:
				System.out.println("January has 31 days.");
				break;
			case 2:
				do{
					repeat = false;
					System.out.print("Is it a leap yaer(enter true or false): ");
					try{
						isLeapYear = in.nextBoolean();
					} catch (java.util.InputMismatchException e){
						in.next();
						System.out.print("Invalid data entry. Try Again.\n\n");
						repeat = true;
						continue;
					}
				} while(repeat);
				if (isLeapYear)
					System.out.println("February has 29 days.");
				else
					System.out.println("February has 28 days.");
				break;
			case 3:
				System.out.println("March has 31 days.");
				break;
			case 4:
				System.out.println("April has 30 days.");
				break;
			case 5:
				System.out.println("May has 31 days.");
				break;
			case 6:
				System.out.println("June has 30 days.");
				break;
			case 7:
				System.out.println("July has 31 days.");
				break;
			case 8:
				System.out.println("August has 31 days.");
				break;
			case 9:
				System.out.println("September has 30 days.");
				break;
			case 10:
				System.out.println("October has 31 days.");
				break;
			case 11:
				System.out.println("November has 30 days.");
				break;
			case 12:
				System.out.println("December has 31 days.");
				break;
			default:
				System.out.println("Error: no month found.");
				break;
		}	
	}
}
