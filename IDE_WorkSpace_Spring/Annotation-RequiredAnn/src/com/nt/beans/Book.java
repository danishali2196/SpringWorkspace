package com.nt.beans;

import org.springframework.beans.factory.annotation.Required;

public class Book {
	
	private int bookid;
	private String bookName;
	private String author;
	
	@Required
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	@Required
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookName=" + bookName + ", author=" + author + "]";
	}

}
