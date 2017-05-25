package com.assignment.task3;

import java.util.Random;

public class RandomNumber {

	public int generateRandomnumber(int start, int finish) {
		Random rand = new Random();

		int n = start + rand.nextInt(finish - start) + 1;

		return n;
	}
}
