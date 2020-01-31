package com.floyd.Ch6.homework;

import java.util.Scanner;

public class PE10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String word;
		int vowels = 0;
		
		System.out.print("Input a word. ");
		word = in.next().toLowerCase();
		
		for(int i = 0; i < word.length(); i++){
			if(word.charAt(i) == 'a'
				|| word.charAt(i) == 'e'
				|| word.charAt(i) == 'i'
				|| word.charAt(i) == 'o'
				|| word.charAt(i) == 'u'
				|| word.charAt(i) == 'y'){
				vowels++;
			}
		}
		System.out.println(vowels + " Vowels");
	}

}
