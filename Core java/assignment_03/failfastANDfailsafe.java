package assignment3;
import java.util.*;
import  java.util.concurrent.*;
class A{
	
	void failfastDemo() {
		///fail fast example:
				 ArrayList<Integer> al = new ArrayList<>();
			     al.add(1);
			     al.add(2);
			     al.add(3);
			     al.add(4);
			     al.add(5);
			     
			   Iterator<Integer> itr = al.iterator();
			     while (itr.hasNext()) {
			     	  System.out.println(itr.next());
			            // will throw Exception
			     	  //as al and itr two different thread so arraylist is fast fail:
			            al.remove(1);
			      
			     }

	
}
}
class B{
	void fastSafeDemo() {
		//fail safe example:
		 ArrayList<Integer> al = new ArrayList<>();
	     al.add(1);
	     al.add(2);
	     al.add(3);
	     al.add(4);
	     al.add(5);
				CopyOnWriteArrayList<Integer> list
		        = new CopyOnWriteArrayList<Integer>(al); 
				 Iterator i = list.iterator();
			        while (i.hasNext()) {
			            Integer no = (Integer)i.next();
			            System.out.println(no);
			            //if(no==3)
			            al.add(78);
			            //	al.remove(0);
			  
			}
			        System.out.println(al);
		
	}
}

public class failfastANDfailsafe {

	public static void main(String[] args) {
	
		while(true) {
		System.out.println("1.fail fast Demo   2.fail safe demo   3.exit");
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		switch (ch) {
        case 1:
           A a=new A();
           a.failfastDemo();
            break;
        case 2:
        	B b=new B();
        	b.fastSafeDemo();
            break;
        case 3:
           return;
           
	    
		}
}
	}}
