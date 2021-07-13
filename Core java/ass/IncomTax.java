package assignment1;

import java.util.Scanner;

public class IncomTax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double num=0.0;
		System.out.println("Enter CTC: ");
		num=sc.nextDouble();
		if(num<=180000&&num>=0)
			System.out.println("Tax amount: 0");
		else if(num>=181001&&num<=300000)
			System.out.println("Tax amount: "+num*0.1);
		else if(num>=300001&&num<=500000)
			System.out.println("Tax amount: "+num*0.2);
		else if(num>=500001&&num<=1000000)
			System.out.println("Tax amount: "+num*0.3);
		else
			System.out.println("Invalid Input");
		sc.close();

	}

}
