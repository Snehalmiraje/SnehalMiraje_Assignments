package assignment3;
import java.util.*;
class savingAccount implements Comparable{

	double acc_bal;
	String acc_id;
	String name;
	boolean issalaryAccount;
	savingAccount(String name,String id,double b,boolean salary){
		this.name=name;
		this.acc_bal=b;
		this.acc_id=id;
		this.issalaryAccount=salary;
		
	}
	public double getAcc_bal() {
		return acc_bal;
	}
	public void setAcc_bal(double acc_bal) {
		this.acc_bal = acc_bal;
	}
	public String getAcc_id() {
		return acc_id;
	}
	public void setAcc_id(String acc_id) {
		this.acc_id = acc_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isIssalaryAccount() {
		return issalaryAccount;
	}
	public void setIssalaryAccount(boolean issalaryAccount) {
		this.issalaryAccount = issalaryAccount;
	}
	public void withdraw(double d) {
		acc_bal=acc_bal-d;
		
	}
	public void credit(double d) {
		acc_bal=acc_bal+d;
	}
	
	@Override
	public int compareTo(Object o) {
		savingAccount s=(savingAccount)o;
		
		return (this.getAcc_id().compareTo(s.getAcc_id()));
	}
	
	
	
}
class BankAccountDetails{
	public static void main(String[] args) {
		savingAccount s1=new savingAccount("snehal","101",2000000,true);
		savingAccount s2=new savingAccount("sachin","100",5000000,true);
		savingAccount s3=new savingAccount("aavi","103",2800000,false);
		savingAccount s4=new savingAccount("aarush","102",890000,true);
		savingAccount s5=new savingAccount("aarush","102",890000,true);
		
		TreeSet<savingAccount> Treeset= new TreeSet<savingAccount>();
		Treeset.add(s1);
		Treeset.add(s2);
		Treeset.add(s3);
		Treeset.add(s4);
		Treeset.add(s5);
		
		System.out.println("savings account sorting by id: ");
		for(savingAccount s: Treeset) {
			System.out.println("acc_id: "+s.getAcc_id()+" acc_bal: "+s.getAcc_bal()+" acc_name: "+s.getName());
			
		}
		
	}
	}


