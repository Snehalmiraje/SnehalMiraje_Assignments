package assignment4;

import java.util.ArrayList;
import java.util.function.Consumer;

public class StingbuilderQ5 {

	public static void main(String[] args) {
		
		ArrayList<String> slist=new ArrayList<>();
		slist.add("my");
		slist.add("state");
		slist.add("is");
		slist.add("maharashtra");
		System.out.println(slist);
		///used StringBuilder
		StringBuilder s =new StringBuilder();
		for(String str:slist) {
			s.append(str.charAt(0));
		}
		//used consumer interface:
		Consumer<StringBuilder> lamda1=snew->System.out.println(snew);
		lamda1.accept(s);
	}
}
