package com.floyd.Ch6.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class PE11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String string;
		ArrayList<String> substring = new ArrayList<String>();
		boolean flag = true;
		
		System.out.print("Input a String: ");
		string = in.next();
		
		for(int start = 0; start < string.length(); start++){//finds all substrings
			for(int end = start + 1; end <= string.length(); end++){
				substring.add(string.substring(start, end));
			}
		}
		System.out.println(substring);
		
		while(flag){
			for(int x = 0; x < substring.size(); x++){
				if(substring[x].compareTo(substring[x + 1]) > 0){
					//swap
				}
			}
		}
	}
}
