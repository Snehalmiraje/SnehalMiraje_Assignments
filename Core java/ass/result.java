package assignment1;

import java.util.Scanner;

public class result {

	public static void main(String[] args) {
		int m1,m2,m3;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Marks of three subjects");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		if(m1>60&&m2>60&&m3>60)
			System.out.println("Student is passed");
		else if((m1>60&&m2>60)||(m1>60&&m3>60)||(m2>60&&m3>60))
			System.out.println("Student is promoted");
		else 
			System.out.println("Student is failed");
		sc.close();
	}

}
