package org.tnsindia.operatorsdemo;
//demo on Assignment operator

import java.util.Scanner;

public class AssignmentOperatorDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of a and b:");
		int a = 8;// s.nextInt();
		int b = 3;//s.nextInt(); 
		a *= b;// a=a*b//a=45
		System.out.println("The value of a is: " + a);
		s.close();
	}

}