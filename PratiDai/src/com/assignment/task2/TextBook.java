package com.assignment.task2;

public abstract class TextBook {

	private String title;
	private String author;
	private String pages;

	public TextBook() {

	}

	public TextBook(String title, String author, String pages) {
		super();
		this.title = title;
		this.author = author;
		this.pages = pages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPages() {
		return pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
	}

	public String toString() {
		/*
		 * private String title; private String author; private String pages;
		 */

		return "Title " + getTitle() + " Author " + getAuthor() + " Pages " + getPages();
	}
}
