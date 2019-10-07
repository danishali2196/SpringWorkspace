package com.nt.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class CustomerItemWriter implements ItemWriter<String> {

	public void write(List<? extends String> bookNameWithAuthor) throws Exception {
		System.out.println("CustomerItemWriter.write()");
		System.out.println(bookNameWithAuthor);
		
	}

}
