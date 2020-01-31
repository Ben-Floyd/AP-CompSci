package com.floyd.ch4and5.lab;

import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String player1, player2;
		boolean repeat = false;
		
		System.out.print("Player 1: Choose rock, paper, or scissors: ");
		player1 = scan.next().toLowerCase();
		System.out.print("Player 2: Choose rock, paper, or scissors: ");
		player2 = scan.next().toLowerCase();
		do{
			repeat = false;
			if(player1.equals("rock")){
				if(player2.equals("rock")){
					System.out.println("It's a tie");
				} else if(player2.equals("paper")){
					System.out.println("Player 2 Wins!");
				} else if(player2.equals("scissors")){
					System.out.println("Player 1 Wins!");
				} else {
					System.out.print("Player 2 has an invalid input. \nPlease enter a new choice: ");
					player2 = scan.next().toLowerCase();
					repeat = true;
				}
			} else if(player1.equals("paper")) {
				if(player2.equals("rock")){
					System.out.println("Player 1 Wins!");
				} else if(player2.equals("paper")){
					System.out.println("It's a tie.");
				} else if(player2.equals("scissors")){
					System.out.println("Player 2 Wins!");
				} else {
					System.out.print("Player 2 has an invalid input. \nPlease enter a new choice: ");
					player2 = scan.next().toLowerCase();
					repeat = true;
				}
			} else if(player1.equals("scissors")) {
				if(player2.equals("rock")){
					System.out.println("Player 2 Wins!");
				} else if(player2.equals("paper")){
					System.out.println("Player 1 Wins!");
				} else if(player2.equals("scissors")){
					System.out.println("It's a tie.");
				} else {
					System.out.print("Player 2 has an invalid input. \nPlease enter a new choice: ");
					player2 = scan.next().toLowerCase();
					repeat = true;
				}
			} else {
				System.out.print("Player 1 has an invalid input. /nPlease enter a new choice: ");
				player1 = scan.next().toLowerCase();
				repeat = true;
			}
		} while(repeat);
	}

}
