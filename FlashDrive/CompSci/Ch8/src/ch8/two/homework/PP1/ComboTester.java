package ch8.two.homework.PP1;

import java.util.Scanner;

public class ComboTester {

	public static void main(String[] args) {
		ComboLock lock = new ComboLock(39, 11, 2);
		Scanner in = new Scanner(System.in);
		boolean isRight = true;
		
		while(!lock.isOpen()){
			if(isRight){
				System.out.println("The Lock is on tick " + lock.tick
								+ "\nYou are turning the lock Right.\n"
								+ "How far do you want to turn it?");
				int ticks = in.nextInt();
				lock.turnRight(ticks);
			} else{
				System.out.println("The Lock is on tick " + lock.tick
						+ "\nYou are turning the lock Left.\n"
						+ "How far do you want to turn it?");
				int ticks = in.nextInt();
				lock.turnLeft(ticks);
			}
			isRight = !isRight;
		}
		System.out.println("The lock is open!");
	}
}
