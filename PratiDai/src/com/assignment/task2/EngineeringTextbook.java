package com.assignment.task2;

public class EngineeringTextbook extends TextBook {

	private String title;
	private String author;
	private String pages;
	private String subject;

	public EngineeringTextbook() {

	}

	public EngineeringTextbook(String title, String author, String pages, String subject) {
		super(title, author, pages);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String toString() {
		/*
		 * private String title; private String author; private String pages;
		 */

		return "Title " + getTitle() + " Author " + getAuthor() + " Pages " 
		+ getPages() + " Subject " + getSubject();
	}
}
