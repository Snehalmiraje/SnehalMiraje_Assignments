package assignment1;

import java.util.Scanner;

public class armStrongNumber {

	public static void main(String[] args) {
		int rem=0,digit=0;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int n=num;
		while(n>0)
		{
			n=n/10;
			digit++;
		}
		int n1=num;
		// System.out.println(digit);
		while(n1>0)
		{
			rem=n1%10;
			sum=(int) (sum +Math.pow(rem, digit));
			n1=n1/10;
		}
		
		if(num==sum)
			System.out.println(num+" is a armstrong number");
		else
			System.out.println(num+" is not a armstrong number");
		
	}

}
