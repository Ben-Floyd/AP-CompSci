package com.floyd.Ch2.homework;

import java.util.Random;

public class DieSimulator {
	public static void main(String[] ats){
		Random genorator = new Random();
		int randInt = genorator.nextInt(6) + 1;
		
		System.out.print(randInt);
	}
}
