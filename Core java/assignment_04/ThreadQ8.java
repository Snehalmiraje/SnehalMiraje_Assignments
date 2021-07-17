package assignment4;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ThreadQ8 {

	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<>();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(55);
	Consumer<ArrayList> lamda1= (l)->{
		System.out.println(l);
	};
	print(list,lamda1);
	}
	//created new thread which prints all the integer from list using Consumer interface:
	private static void print(ArrayList<Integer> list, Consumer<ArrayList> lamda1) {
		Thread mylamda=new Thread(()->{
			lamda1.accept(list);
			});
		mylamda.run();
		
	}

}
