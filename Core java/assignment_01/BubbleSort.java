package assignment1;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);		
		int array[]=new int[15];
		int i;
		System.out.println("Enter numbers:");
		for(i=0;i<15;i++)
			array[i]=sc.nextInt();
		int tmp,j;
		for(i=0;i<14;i++)
		{
			for(j=0;j<15-i-1;j++)
			{
				if(array[j+1]<array[j])
				{
					tmp=array[j+1];
					array[j+1]=array[j];
					array[j]=tmp;
				}
			}
		}
		for(i=0;i<15;i++)
			System.out.println(" "+array[i]+" ");
		sc.close();
	}

}
