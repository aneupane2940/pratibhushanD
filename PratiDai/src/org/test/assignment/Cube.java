package org.test.assignment;

public class Cube {

	
	public void processCube(int start, int end) {
		System.out.println("\tNumber \tCube");
		for (int i = start; i <= end; i++) {
			System.out.println("\t"+i + "\t" + i * i);
		}

	}

}
