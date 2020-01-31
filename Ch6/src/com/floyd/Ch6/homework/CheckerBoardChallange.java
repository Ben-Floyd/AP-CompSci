package com.floyd.Ch6.homework;

public class CheckerBoardChallange {

	public static void main(String[] args) {
		boolean isStar = true;
		
		System.out.println("Checker Board using for loops.\n");
		//prints Checker Board using for loops
		for(int y = 0; y < 25; y++){
			for(int x = 0; x < 48; x++){
				if(isStar){
					System.out.print("*");
				} else {
					System.out.print("-");
				}
				if(x % 8 == 7){//switches to new character
					isStar = !isStar;
				}
			}
			System.out.print("\n");//starts new line
			if(y % 5 == 4){//switches to new character
				isStar = !isStar;
			}
		}
		
		System.out.println("\nChecker Board using while loops.\n");
		//prints Checker Board using for loops
		isStar = true;
		int y = 0, x;
		while(y < 25){
			x = 0;
			while(x < 48){
				if(isStar){
					System.out.print("*");
				} else {
					System.out.print("-");
				}
				if(x % 8 == 7){
					isStar = !isStar;
				}
				x++;
			}
			System.out.print("\n");//starts new line
			if(y % 5 == 4){
				isStar = !isStar;
			}
			y++;
		}
	}
}
