package com.assignment.task2;

public class ProgrammingTextbook extends TextBook {

	private String title;
	private String author;
	private String pages;
	private String language;

	public ProgrammingTextbook() {

	}

	public ProgrammingTextbook(String title, String author, String pages, String language) {
		super(title, author, pages);
		this.language = language;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String toString() {
		/*
		 * private String title; private String author; private String pages;
		 */

		return "Title " + getTitle() + " Author " + getAuthor() 
		+ " Pages " + getPages() + " Language " + getLanguage();
	}
}
