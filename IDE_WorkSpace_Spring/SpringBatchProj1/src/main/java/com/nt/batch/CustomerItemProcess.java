package com.nt.batch;

import org.springframework.batch.item.ItemProcessor;

public class CustomerItemProcess implements ItemProcessor<String, String>{

	public String process(String bookNameWithoutAuthor) throws Exception {
		System.out.println("CustomerItemProcess.process()");
		String bookNameWithAuthor = "book name - "+bookNameWithoutAuthor+" Author name";
		
		if ("CoreJava".equalsIgnoreCase(bookNameWithoutAuthor)) {
			bookNameWithAuthor += "Hari Krishna";
		}
		else if("Spring".equalsIgnoreCase(bookNameWithoutAuthor)) {
			bookNameWithAuthor += "Nataraj";
		}
		else if("UI".equalsIgnoreCase(bookNameWithoutAuthor)) {
			bookNameWithAuthor += "Naveen";
		}
		
		return  bookNameWithAuthor;
	}

}
