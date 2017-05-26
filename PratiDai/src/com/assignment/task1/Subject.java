package com.assignment.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Subject {

	private String name;
	private String code;

	public Subject(String name, String code) {
		super();
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean codeMatches(String code) {
		return this.code.equalsIgnoreCase(code);
	}

	public String toString() {
		return "Subject : \t" + name + "code: \t" + code;
	}

	public List<String> allDisciplines(List<Subject> subjects) {
		List<String> allDisciple = new ArrayList<>();
		for (Subject s : subjects) {
			allDisciple.add(s.getCode().substring(0, 3));
		}
		Collections.sort(allDisciple);
		return allDisciple;
	}

	public List<String> codesPerDiscipline(List<Subject> subjects, String code) {
		List<String> allDisciple = new ArrayList<>();
		for (Subject s : subjects) {
			if (code.equals(s.getCode().substring(0, 3))) {
				allDisciple.add(s.getCode());
			}
		}
		Collections.sort(allDisciple);
		return allDisciple;
	}

	public boolean isValidCode(String code) {
		String first = code.substring(0, 3);
		String second = code.substring(3);

		for (char c : first.toCharArray()) {
			if (!Character.isLetter(c)) {
				return false;
			}
		}

		for (char c : second.toCharArray()) {
			if (!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}

	public boolean codeExists(List<Subject> subjects, String code) {
		for (Subject s : subjects) {
			if (code.equals(s.getCode())) {
				return true;
			}
		}
		return false;
	}

	public List<Subject> sortDisciplines(List<Subject> subjects) {
		List<String> allDisciple = new ArrayList<>();
		for (Subject s : subjects) {
			allDisciple.add(s.getCode());
		}
		Collections.sort(allDisciple);
		List<Subject> sortedSubject = new ArrayList<>();

		for (String s : allDisciple) {
			for (Subject sub : subjects) {
				if (sub.getCode().equalsIgnoreCase(s)) {
					sortedSubject.add(sub);
				}
			}
		}
		return sortedSubject;
	}
	
	public String getDiscipline(){
		return this.getCode().substring(0, 3);
	}
}
