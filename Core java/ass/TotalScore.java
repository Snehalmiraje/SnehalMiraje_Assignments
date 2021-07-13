package assignment1;

import java.util.Scanner;

public class TotalScore {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int x=0,y=0,z=0;
		System.out.println(" Enter marks of 3 student for subject");
		int i;
		student[] s;
		s=new student[3];
		for(i=0;i<3;i++)
		{
			
			x=sc.nextInt();
			y=sc.nextInt();
			z=sc.nextInt();
			s[i]=new student(x,y,z);
		}
		sc.close();
		for(i=0;i<3;i++)
		{
			System.out.println("total of  student "+(i+10+" :"+s[i].Total()));
			System.out.println("avg of student: "+(i+1)+" :"+s[i].avgScore());		
		}
		
		{
			System.out.println("total for subject a :"+(s[0].a+s[1].a+s[2].a));
			System.out.println("avg for subject a :"+(s[0].a+s[1].a+s[2].a)/3);		
		}
		{
			System.out.println("total for subject b :"+(s[0].b+s[1].b+s[2].b));
			System.out.println("bvg for subject b :"+(s[0].b+s[1].b+s[2].b)/3);		
		}
		{
			System.out.println("total for subject c :"+(s[0].c+s[1].c+s[2].c));
			System.out.println("avg for subject c :"+(s[0].c+s[1].c+s[2].c)/3);		
		}
	
		sc.close();
		
	}

}
class student{
public 	int a,b,c,t;
	student(int aa,int bb, int cc){
		this.a=aa;
		this.b=bb;
		this.c=cc;
	}
	student(){}
		int Total()
		{
		t= a+b+c;
		return t;
		}
		float avgScore() 
		{ 
			return t/3;
		}
		
}
