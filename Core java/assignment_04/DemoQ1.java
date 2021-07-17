package assignment4;

import java.util.Scanner;

@FunctionalInterface
interface arthmetic{
	double demo(double a,double b);
}

public class DemoQ1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number:");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		
		arthmetic addlamda = (double x,double y)-> {return(x+y);};
		System.out.println("addtion is: "+addlamda.demo(a, b));
		
		arthmetic subtractlamda = (double x,double y)-> {return(x-y);};
		System.out.println("subtraction is is: "+subtractlamda.demo(a, b));
		
		arthmetic mullamda = (double x,double y)-> {return(x*y);};
		System.out.println("multiplication is: "+mullamda.demo(a, b));
		
		arthmetic divlamda = (double x,double y)-> {return(x/y);};
		System.out.println("division is: "+divlamda.demo(a, b));
		
	}

}
