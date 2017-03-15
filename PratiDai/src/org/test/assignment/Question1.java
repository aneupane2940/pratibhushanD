package org.test.assignment;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		System.out.println("“Welcome to Cubing Program!");
		System.out.println("\nPlease enter two positive whole numbers,");
		System.out.println("\nstarting and finishing values");
		System.out.println("\nfirst one should be smaller than the second one");

		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("\nEnter first number: \n");
		int start = reader.nextInt(); 
		
		System.out.println("\nEnter second number: \n");
		
		int end = reader.nextInt(); 
		
		Cube c = new Cube();
		c.processCube(start , end);
		
		System.out.println("\nGoodbye, thank you for using our program!");
	}
}
