package com.floyd.Ch2.homework;

import java.util.Random;

public class RandomPrice {
	public static void main(String[] args) {
		Random genorator = new Random();
		double randPrice = genorator.nextInt(996) + 1000;
		
		System.out.print("$" + randPrice / 100);
	}
}