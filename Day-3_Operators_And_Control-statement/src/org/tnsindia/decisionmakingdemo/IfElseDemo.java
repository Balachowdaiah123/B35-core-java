package org.tnsindia.decisionmakingdemo;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a =99; //s.nextInt();
		int b =100; //s.nextInt();

		// if..else statement(when two things will going be check)
		if (a > b) {
			System.out.println("A is greater" + a);
		} 
		else {
			System.out.println("B is greater" + b);
		}

	}

}
