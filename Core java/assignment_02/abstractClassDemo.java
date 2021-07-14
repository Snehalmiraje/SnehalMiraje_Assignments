package assignment2;

abstract class person{
	String name;
	int age;
	person()
	{
	 name="snehal";
     age=22
			;}
	void display() {
		System.out.println("Person info is:"+"\n "+"name: "+name+"\n "+"age: "+age);
	}
	 abstract void displayADD() ;
	
}
class student extends person{
	String add="kolhapur";
	student(){
		super();
	}
	@Override
	void displayADD() {
		
		System.out.println("this is address :"+" "+add);
	}
	
}
public class abstractClassDemo {

	public static void main(String[] args) {
		student s=new student();
	    s.display();
		s.displayADD();
		
		

	}

}
