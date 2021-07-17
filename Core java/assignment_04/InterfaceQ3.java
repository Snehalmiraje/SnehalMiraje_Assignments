package assignment4;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class ordereample{
	String product;
	double price;
	ordereample(String st,double p){
		product=st;
		price=p;
	}
	public String getStatus() {
		return product;
	}
	public void setStatus(String status) {
		this.product = status;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "order [status=" + product + ", price=" + price + "]";
	}
	
	
}
public class InterfaceQ3 {
	public static void main(String[] args) {
		
		ArrayList<ordereample> list=new ArrayList<>();
		list.add(new ordereample("fashion",1500.0));
		list.add(new ordereample("fashion",5000.0));
		list.add(new ordereample("home-appliances",200.0));
		list.add(new ordereample("jwellary",500.0));
		list.add(new ordereample("shoes",500.0));
		list.add(new ordereample("electronics",10000.0));
		list.add(new ordereample("jwellary",500.0));
		
		//using in built interface function:
		System.out.println("printing price of product:");
		Function<ordereample,?> lamda1=(o)->{
			return ((ordereample) o).getPrice();
		};
		print(list,lamda1);
		System.out.println("_________________");
		
		//using predict interface :
		System.out.println("printing price and product having price 500:");
		Predicate<ordereample> lamda2=(o)->{
			return ((ordereample) o).getPrice()==500.0;
		};
		print1(list,lamda2);
		
		//using Suppiler interface:
		System.out.println("_______________");
		System.out.println("Printing random values:");
		Supplier<Double> lamda3=()->{
			return Math.random();
		};
		System.out.println(lamda3.get());
		
		///using consumer interface:
		System.out.println("_______________");
		System.out.println("printing offer applied on products:");
		Consumer<Integer> lamda4=(v)->{int value = v;
			System.out.println(value);};
		lamda4.accept(30);
	}

	private static void print1(ArrayList<ordereample> list, Predicate<ordereample> lamda2) {
		for(ordereample o:list) {
			if(lamda2.test(o)){
				System.out.println("product is: "+o.getStatus()+"price is: "+o.getPrice());
			}
		}
		
	}

	private static void print(ArrayList<ordereample> list, Function<ordereample, ?> lamda1) {
		for(ordereample o:list) {
			System.out.println(lamda1.apply(o));
		}
	}

}
