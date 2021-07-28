package com.example.springassignmentQ2;

import java.util.Iterator;
import java.util.Map;

public class Questionmap {
	String questionId,question;
	Map<Integer,String> ans;
	
	
	public Questionmap(String questionId, String question, Map<Integer, String> ans) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.ans = ans;
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
	public Map<Integer, String> getAns() {
		return ans;
	}
	public void setAns(Map<Integer, String> ans) {
		this.ans = ans;
	}
	
	public void displayInfomap(){  
	    System.out.println(questionId+" "+question);  
	    System.out.println("answers are:");
	    for (Map.Entry<Integer,String> entry : ans.entrySet())
	         System.out.println("Key = " + entry.getKey() +
	                          ", Value = " + entry.getValue());
	   
	    }  
	
	
	 
}

