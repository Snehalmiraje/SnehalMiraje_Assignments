package assignment4;

import java.util.ArrayList;


class order{
	String status;
	double price;
	order(String st,double p){
		status=st;
		price=p;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "order [status=" + status + ", price=" + price + "]";
	}
	
	
}
@FunctionalInterface
interface orderdemo1{
	 boolean condition(order o);
}

public class orderQ2 {
	public static void main(String[] args) {
		ArrayList<order> list=new ArrayList<>();
		list.add(new order("COMPLETED",1500.0));
		list.add(new order("ACCEPTED",5000.0));
		list.add(new order("ACCEPTED",200.0));
		list.add(new order("COMPLETED",500.0));
		list.add(new order("COMPLETED",500.0));
		list.add(new order("rejected",10000.0));
		list.add(new order("rejected",500.0));
		
		System.out.println("Printing order having price greater than 1000:");
		orderdemo1 lamda1= (order o)->{
			return o.getPrice()>1000;
		};
		filter(list,lamda1);
		
		System.out.println("_____Printing order having status completed or accepted:___");
		orderdemo1 lamda2= (order o)->{
			return (o.getStatus()=="COMPLETED"  || o.getStatus()=="ACCEPTED");
		};
		
		filter(list,lamda2);
		
		
		
	}

	private static void filter(ArrayList<order> list,orderdemo1 c) {
		for(order o:list) {
			if(c.condition(o))
					System.out.println("price is: "+o.getPrice()+"status is: "+o.getStatus());
					
		}
		
	}

}
