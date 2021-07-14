package assignment2;

 class bank{
	double total;
	bank(double t)
	{
		total=t;
	}
	double getTotalBalanace() {
		return total;
	}

}

class savings extends bank{
	double fixdeposite;
	
	savings(double t,double f) {
		super(t);
		fixdeposite=f;
	
	}
	double getTotalBalanace() {
		return total+fixdeposite;
	}

	
	
}
class current extends bank{
	double cashcredit;
	
	current(double t,double c) {
		super(t);
		cashcredit=c;
		
	}
	double getTotalBalanace() {
		return total+cashcredit;
	}
	
}
class bankAccount{
	
	public static void main(String[] args)
	{
		current c=new current(100000,4000);
		savings s= new savings(600000,7000);
		
		System.out.println("Total cash in bank is: "+(c.getTotalBalanace()+s.getTotalBalanace()));
	}
}

