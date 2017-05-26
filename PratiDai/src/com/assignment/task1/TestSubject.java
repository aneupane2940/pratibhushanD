package com.assignment.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TestSubject {
	public static List<Subject> ALL_SUBJECT = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		loadAllSubjects();
		System.out.println("Printing all subject  ");
		for (Subject s : ALL_SUBJECT) {
			System.out.println("Subject " + s.getName() + " Code " + s.getCode());
		}

		System.out.println();
		Subject testSubject = ALL_SUBJECT.get(0);
		System.out.println("for testing taking " + testSubject.toString());

		System.out.println("test discipline ");
		System.out.println(testSubject.getDiscipline());

		System.out.println();
		System.out.println("test code matches ");
		System.out.println("test if code \"MAT200\" matches ");
		System.out.println(testSubject.codeMatches("MAT200"));

		System.out.println("test if code \"MAT100\" matches ");
		System.out.println(testSubject.codeMatches("MAT100"));

		System.out.println();
		System.out.println("test get all discipline ");
		System.out.println(testSubject.allDisciplines(ALL_SUBJECT));
		System.out.println("test get all discipline ");
		System.out.println(testSubject.allDisciplines(ALL_SUBJECT));

		System.out.println();
		System.out.println("test codes per discipline ");
		System.out.println("test for code \"MAT\" ");
		System.out.println(testSubject.codesPerDiscipline(ALL_SUBJECT, "MAT"));

		System.out.println();
		System.out.println("test is valid code ");

		System.out.println("test if code \"MAT500\" is valid ");
		System.out.println(testSubject.isValidCode("MAT500"));

		System.out.println("test if code \"MATA00\" matches ");
		System.out.println(testSubject.isValidCode("MATA00"));

		System.out.println();
		System.out.println("test if code exist ");

		System.out.println("test if code \"MAT500\" exist ");
		System.out.println(testSubject.codeExists(ALL_SUBJECT, "MAT500"));

		System.out.println("test if code \"MAT100\" matches ");
		System.out.println(testSubject.codeExists(ALL_SUBJECT, "MATA00"));

		System.out.println();
		System.out.println("test sort discipline ");
		System.out.println("printing sorted subject");

		for (Subject s : testSubject.sortDisciplines(ALL_SUBJECT)) {
			System.out.println("Subject " + s.getName() + " Code " + s.getCode());
		}

		System.out.println();
		System.out.println("testing adding subject ");

	
		while (true) {
			System.out.println("Do you want to continue (Y/N)");
			BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
			String continueSt = br2.readLine();
			if(continueSt.equalsIgnoreCase("N")){
				break;
			}
			System.out.println("please add subject ....");

			System.out.println("Please enter Subject name ");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String subject = br.readLine();

			System.out.println("Please enter Code ");
			BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
			String code = br1.readLine();

			Subject newSub = new Subject(subject, code);
			ALL_SUBJECT.add(newSub);

			System.out.println("Printing all subject after inserted ...");
			for (Subject s : testSubject.sortDisciplines(ALL_SUBJECT)) {
				System.out.println("Subject " + s.getName() + " Code " + s.getCode());
			}
			
			

		}
		System.out.println("Thanks for using our application ");
	}

	private static void loadAllSubjects() {
		Subject s1 = new Subject("Math", "MAT100");
		Subject s4 = new Subject("Math", "MAT200");
		Subject s2 = new Subject("Engineering", "ENG100");
		Subject s3 = new Subject("Computer", "COM100");
		ALL_SUBJECT.add(s1);
		ALL_SUBJECT.add(s2);
		ALL_SUBJECT.add(s3);
		ALL_SUBJECT.add(s4);

	}

	public static List<Subject> getALL_SUBJECT() {
		return ALL_SUBJECT;
	}

	public static void setALL_SUBJECT(List<Subject> aLL_SUBJECT) {
		ALL_SUBJECT = aLL_SUBJECT;
	}
}
