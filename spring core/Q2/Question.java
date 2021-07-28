package com.example.springassignmentQ2;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Question {
	String questionId,question;
	List<String> answer;
	
	
	public Question(String questionId, String question, List<String> answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answer = answer;
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
	public List<String> getAnswer() {
		return answer;
	}
	public void setAnswer(List<String> answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", question=" + question + ", answer=" + answer + "]";
	}
	
	public void displayInfo(){  
	    System.out.println(questionId+" "+question);  
	    System.out.println("answers are:");  
	    Iterator<String> itr=answer.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next());  
	    }  
	}  
	
	

}
