package com.nt.batch;

import java.util.List;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class CustomerItemReader implements ItemReader<String> {
	private List<String> bookNameList;
	private int bookCount;
	
	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		System.out.println("CustomerItemReader.read()");
		if (bookCount < bookNameList.size()) {
			return bookNameList.get(bookCount++);
		}
		else {
			return null;
		}
	}

	public void setBookNameList(List<String> bookNameList) {
		this.bookNameList = bookNameList;
	}

}
