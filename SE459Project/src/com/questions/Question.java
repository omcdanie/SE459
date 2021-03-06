/**
 * 
 */
package com.questions;

/**
 * @author olamcdaniel
 *
 */
public class Question implements Questions {

	private String question;
	private String category;
	private int index;
	
	public Question(int index, String question, String category) {
		this.index = index;
		this.question = question;
		this.category = category;
	}
	@Override
	public String getQuestion() {
		
		return question;
	}

	@Override
	public String getCategory() {
		
		return category;
	}

	@Override
	public int getQuestionIndex() {
		
		return index;
	}

	@Override
	public boolean isQuestionCurrent() {
		
		return false;
	}

}
