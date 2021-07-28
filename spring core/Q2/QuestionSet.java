package com.example.springassignmentQ2;

import java.util.Iterator;
import java.util.Set;

public class QuestionSet {
	String questionId,question;
	Set<String> answer1;
	
	public QuestionSet(String questionId, String question, Set<String> answer1) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer1 = answer1;
	}
	public String getQuestionId() {
		return questionId;
	}
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Set<String> getAnswer1() {
		return answer1;
	}
	public void setAnswer1(Set<String> answer1) {
		this.answer1 = answer1;
	}
	
	public void displayInfoset(){  
	    System.out.println(questionId+" "+question);  
	    System.out.println("answers are:");  
	    Iterator<String> itr=answer1.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next());  
	    }  
	}  

}
