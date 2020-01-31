package com.floyd.ch7.homework;

public class Homework7_1 {

	public static void main(String[] args) {
		int[] arrayA = new int[10], arrayB = new int[11], arrayC = new int[10], arrayD = new int[10], arrayE = {1, 4, 9, 16, 9, 7, 4, 9, 11}, arrayF = new int[9];
		
		System.out.print("A: ");
		for(int i = 0; i < arrayA.length; i++){
			if(i != 0){System.out.print(arrayA[i -1] + ", ");}
			arrayA[i] = i +1;
		}
		System.out.println(arrayA[arrayA.length - 1]);
		
		System.out.print("B: ");
		for(int i = 0; i < arrayB.length; i++){
			if(i != 0){System.out.print(arrayB[i -1] + ", ");}
			arrayB[i] = i *2;
		}
		System.out.println(arrayB[arrayB.length - 1]);
		
		System.out.print("C: ");
		arrayC[0] = 1;
		for(int i = 1; i < arrayC.length; i++){
			System.out.print(arrayC[i - 1] + ", ");
			arrayC[i] = arrayC[i-1] + (2 *i + 1);
		}
		System.out.println(arrayC[arrayC.length - 1]);
		
		System.out.print("D: ");
		for(int i = 0; i < arrayD.length; i++){
			if(i != 0){System.out.print(arrayD[i -1] + ", ");}
		}
		System.out.println(arrayD[arrayD.length - 1]);
		
		System.out.print("E: ");
		for(int i = 0; i < arrayE.length; i++){
			if(i != 0){System.out.print(arrayE[i -1] + ", ");}
		}
		System.out.println(arrayE[arrayE.length - 1]);
		
		System.out.print("F: ");
		for(int i = 0; i < arrayF.length; i++){
			if(i != 0){System.out.print(arrayF[i -1] + ", ");}
			arrayF[i] = (i + 1) % 5;
		}
		System.out.println(arrayF[arrayF.length - 1]);
	}
}