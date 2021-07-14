package assignment2;

class employee{
	double salary;
	employee(double s){
		this.salary=s;
	}
	public double getSalary() {
		return salary;
	}
	
}
class manager extends employee{
	double incentive;
	manager(double s,double i) {
		super(s);
		this.incentive=i;
		
	}
	public double getSalary() {
		return salary+incentive;
	}
	
	
	
}
class labour extends employee{
	double overtime;
	
	labour(double s,double o) {
		super(s);
		this.overtime=o;
		
	}
	public double getSalary() {
		return salary+overtime;
	}

	
}


public class organization {

	public static void main(String[] args) {
		
		manager m =new manager(20000,1000);
		System.out.println("Salary of manager: "+m.getSalary());

		labour l=new labour(3000,500);
		System.out.println("Salary of labour: "+l.getSalary());

	}

}

