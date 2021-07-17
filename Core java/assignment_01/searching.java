package assignment1;

import java.util.Scanner;

public class searching {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);		
		int array[]=new int[15];
		int i,num;
		System.out.println("Enter numbers:");
		for(i=0;i<15;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("Enter number to find:");
		num=sc.nextInt();
		for(i=0;i<15;i++)
		{
			if(array[i]==num)
				break;
		}
		System.out.print("Number");
		if(i==15)
			System.out.print(" not");
		System.out.print(" Found");
		sc.close();
	}

}
