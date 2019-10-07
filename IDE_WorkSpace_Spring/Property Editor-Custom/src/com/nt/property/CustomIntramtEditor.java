package com.nt.property;

import java.beans.PropertyEditorSupport;

import com.nt.beans.IntrAmtDetails;

public class CustomIntramtEditor extends PropertyEditorSupport {
	
	public CustomIntramtEditor() {
		System.out.println("CustomIntramtEditor::0-param constructor");
	}
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		System.out.println("CustomIntramtEditor.setAsText(-)");
		
		//sprit the given value
		float principle = Float.parseFloat(text.substring(0, text.indexOf(",")));
		float rate = Float.parseFloat(text.substring(text.indexOf(",")+1, text.lastIndexOf(",")));
		float time = Float.parseFloat(text.substring(text.lastIndexOf(",")+1, text.length()));
		
		IntrAmtDetails details = new IntrAmtDetails();
		details.setPrinciple(principle);
		details.setRate(rate);
		details.setTime(time);
		setValue(details);
	}

}
