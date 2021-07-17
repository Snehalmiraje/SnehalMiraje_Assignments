package assignment4;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class unaryOpinterfaceQ6 {

	public static void main(String[] args) {
		ArrayList<String> slist=new ArrayList<>();
		slist.add("my");
		slist.add("state");
		slist.add("is");
		slist.add("maharashtra");
		System.out.println(slist);
		//used unary interface:
		UnaryOperator<String> lamda1 =(s)->{
		return s.toUpperCase();
		};
		print(slist,lamda1);
		
		
		//the following lines also works
		//slist.replaceAll(lamda1);
		//System.out.println(slist);
		
	}

	private static void print(ArrayList<String> slist, UnaryOperator<String> lamda1) {
	
		slist.replaceAll(lamda1);
		System.out.println(slist);
	}

}
