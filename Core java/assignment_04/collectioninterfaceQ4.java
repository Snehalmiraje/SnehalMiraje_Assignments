package assignment4;

import java.util.ArrayList;


public class collectioninterfaceQ4 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("snehal");
		list.add("one");
		list.add("therefore");
		list.add("print");
		list.add("sachin");
		System.out.println(list);
		list.removeIf(s->(s.length()%2)!=0);
		System.out.println(list);
	}

}
