package org.tnsindia.lambdaexodemo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorInterfaceDemoUsingLamda {

	public static void main(String[] args) {
		
		/*Comparator is as functional interface which contains
		exactly one abstract method*/
		Comparator<String>obj=(s1,s3)->Integer.compare(s1.length(), s3.length());
		String str[]= {"Deeksha","Tanuja","Bala","Devendra"};
		//arrange into ascending order of the length of the string
		Collections.sort(Arrays.asList(str),obj);
		for(String itr:str)
		{
			System.out.print(itr+" ");
		}
		
	}

}
