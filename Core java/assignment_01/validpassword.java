package assignment1;

import java.util.Scanner;

public class validpassword {

	public static void main(String[] args) {
		String pass="snehal@123";
		String name="snehal";
		Scanner sc= new Scanner(System.in);
		int i=1;
		for(;i<4;i++)
		{	
			System.out.println("Enter name :"+i+":");
			String tempname=sc.next();
			System.out.println("Enter password:"+i+":");
			String tempass=sc.next();
			
			if(name.equals(tempname)&& pass.equals(tempass))
			{ System.out.println("WELCOME");
			break;}
		}
		if(i==4)System.out.println("Contact Admin");
	}

}
