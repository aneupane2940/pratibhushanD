package com.assignment.task2;

import java.util.ArrayList;
import java.util.List;

public class TestTextbooks {
	public static void main(String[] args) {

		TextBook t1 = new ProgrammingTextbook("PTbok Title 1", "PTbok author 1", "PTbok page 1 ", "PTbok language 1");
		TextBook t2 = new ProgrammingTextbook("PTbok Title 2", "PTbok author 2", "PTbok page 2 ", "PTbok language 2");

		TextBook t3 = new EngineeringTextbook("ETbok Title 1", "ETbok author 1", "ETbok page 1 ", "ETbok subject 1");

		TextBook t4 = new EngineeringTextbook("ETbok Title 2", "ETbok author 2", "ETbok page 2 ", "ETbok subject 2");

		List<TextBook> bookList = new ArrayList<>();
		bookList.add(t1);
		bookList.add(t2);
		bookList.add(t3);
		bookList.add(t4);

		System.out.println(" All books....");
		for (TextBook t : bookList) {
			System.out.println(t.toString());
		}
	}
}
