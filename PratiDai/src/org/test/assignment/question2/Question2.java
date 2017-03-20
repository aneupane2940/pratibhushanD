package org.test.assignment.question2;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		System.out.println("“Welcome to Income Tax Program!");
		System.out.println("\nPlease enter");
		System.out.println("\n 0 - Single");
		System.out.println("\n 1 - Married filing jointly");
		System.out.println("\n 2 - Married filing separately");
		System.out.println("\n 3 - head of household");

		Scanner reader = new Scanner(System.in); // Reading from System.in
		System.out.println("\nEnter the filing status: \n");
		int filingStatus = reader.nextInt();

		System.out.println("\nEnter the taxable income: \n");
		int income = reader.nextInt();
		float tax = 0;
		if (filingStatus == 0) {
			if (income <= 8350) {
				tax = (float) (income * 0.1);
			
			} else if (income >= 8351 && income <= 33950) {
				tax = (float) (8350 * 0.1 + (income - 8350) * 0.15);
			
			} else if (income >= 33951 && income <= 82250) {
				tax = (float) (8350 * 0.1 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25);
			
			} else if (income >= 82251 && income <= 171550) {
				tax = (float) (8350 * 0.1 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28);
			
			} else if (income >= 171551 && income <= 332950) {
				tax = (float) (8350 * 0.1 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
						+ (income - 171551) * 0.33);
			} else if (income >= 332951) {
				tax = (float) (8350 * 0.1 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
						+ (332950 - 171551) * 0.33 + (income - 332951) * 0.35);
			}
		}

		if (filingStatus == 1) {
			
			if (income <= 16700) {
				tax = (float) (income * 0.1);

			} else if (income >= 16701 && income <= 67900) {
				tax = (float) (16700 * 0.1 + (income - 16700) * 0.15);

			} else if (income >= 67901 && income <= 137050) {
				tax = (float) (16700 * 0.1 + (67900 - 16701) * 0.15 + (income - 67901) * 0.25);

			} else if (income >= 137051 && income <= 208850) {
				tax = (float) (16700 * 0.1 + (67900 - 16701) * 0.15 + (137050 - 67901) * 0.25
						+ (income - 137050) * 0.28);

			} else if (income >= 208851 && income <= 332950) {
				tax = (float) (16700 * 0.1 + (67900 - 16701) * 0.15 + (137050 - 67901) * 0.25 + (208850 - 137051) * 0.28
						+ (income - 208851) * 0.33);

			} else if (income >= 332951) {
				tax = (float) (16700 * 0.1 + (67900 - 16701) * 0.15 + (137050 - 67901) * 0.25 + (208850 - 137051) * 0.28
						+ (332950 - 208851) * 0.33 + (income - 332951) * 0.35);
			}
		}

		if (filingStatus == 2) {
			if (income <= 8350) {
				tax = (float) (income * 0.1);

			} else if (income >= 8351 && income <= 33950) {
				tax = (float) (8350 * 0.1 + (income - 8350) * 0.15);

			} else if (income >= 33951 && income <= 68525) {
				tax = (float) (8350 * 0.1 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25);

			} else if (income >= 68526 && income <= 104425) {
				tax = (float) (8350 * 0.1 + (33950 - 8350) * 0.15 + (68525 - 33951) * 0.25 + (income - 68525) * 0.28);

			} else if (income >= 104426 && income <= 180475) {
				tax = (float) (8350 * 0.1 + (33950 - 8351) * 0.15 + (68525 - 33951) * 0.25 + (104425 - 68526) * 0.28
						+ (income - 104425) * 0.33);

			} else if (income >= 180476) {
				tax = (float) (8350 * 0.1 + (33950 - 8351) * 0.15 + (68525 - 33951) * 0.25 + (104425 - 68526) * 0.28
						+ (180475 - 104426) * 0.33 + (income - 180476) * 0.35);
			}
		}
		
		if (filingStatus == 3) {
			if (income <= 11950) {
				tax = (float) (income * 0.1);

			} else if (income >= 11951 && income <= 45500) {
				tax = (float) (11950 * 0.1 + (income - 11950) * 0.15);

			} else if (income >= 45501 && income <= 117450) {
				tax = (float) (11950 * 0.1 + (45500 - 11951) * 0.15 + (income - 45500) * 0.25);

			} else if (income >= 117451 && income <= 190200) {
				tax = (float) (11950 * 0.1 + (45500 - 11951) * 0.15 + (117450 - 45501) * 0.25 + (income - 117450) * 0.28);

			} else if (income >= 190201 && income <= 372950) {
				tax = (float) (11950 * 0.1 + (45500 - 11951) * 0.15 + (117450 - 45501) * 0.25 + (190200 - 117451) * 0.28
						+ (income - 190200) * 0.33);

			} else if (income >= 372951) {
				tax = (float) (11950 * 0.1 + (45500 - 11951) * 0.15 + (117450 - 45501) * 0.25 + (190200 - 117451) * 0.28
						+ (372950 - 190201) * 0.33 + (income - 372951) * 0.35);
			}
		}

		System.out.println("\nTax is \t" + tax);
		System.out.println("\nGoodbye, thank you for using our program!");
	}
}
