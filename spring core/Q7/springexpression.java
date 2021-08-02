package com.example.springassignmentQ7;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class springexpression {

	public static void main(String[] args) {
		SpelExpressionParser parser = new SpelExpressionParser();  
		 
		Expression exp = parser.parseExpression("'This is demo of spring expression....'");  
		String message = (String) exp.getValue();  
		System.out.println(message);  
		
		SpelExpressionParser parser1= new SpelExpressionParser();  
		Expression exp1 = parser.parseExpression("'This is demo of spring expression.....'.concat('concat process')");  
		String message1 = (String) exp1.getValue();  
		System.out.println(message1);  
		
		Expression exp3= parser.parseExpression("'This is demo of spring expression'.bytes.length");  
		int length = (Integer) exp3.getValue();  
		System.out.println(length);  
		
		System.out.println(parser.parseExpression("'snehal'.toUpperCase()").getValue());  
		System.out.println(parser.parseExpression("'SNEHAL'.toLowerCase()").getValue());  
	}

}
