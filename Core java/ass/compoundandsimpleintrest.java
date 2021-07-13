package assignment1;

import java.util.Scanner;

public class compoundandsimpleintrest {

	public static void main(String[] args) {
		float p,r,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principle,rate,time:");
		p=sc.nextFloat();
		r=sc.nextFloat();
		t=sc.nextFloat();
		
		double simpleInterest=p*r*t/100;
		double compoundInterest=p*Math.pow((1+r/100),t)-p;
		System.out.println("Simple Interest : "+String.format("%.2f",simpleInterest));
		System.out.println("Compound Interest : "+String.format("%.2f",compoundInterest));
	sc.close();
	}

}
