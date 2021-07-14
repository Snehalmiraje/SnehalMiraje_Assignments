package assignment2;
import java.util.*;
abstract class  dessertItem{

abstract double getcost();

} 

class candy extends dessertItem{
	int q;
	int candystorage=100;
	double prize=6;
	candy(int q){
		candystorage=candystorage-q;
		this.q=q;
	}
	candy(){}
	@Override
	double getcost() {
			return q*prize*60;
	}
	void  addDessertItem() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter candy quantity:");
		candystorage=candystorage+sc.nextInt();
	}
	void displayDessertItem() {
		System.out.println("Dessert quantity  is :");
		System.out.println(" Candy: "+candystorage);
	
	}
	
	
}


class cookie extends dessertItem{
	int q;
	int cookietorage=90;
	double prize=5; //in euro
	
 cookie(int q){
	 cookietorage=cookietorage-q;

	 this.q=q;
 }
 cookie(){}

 @Override
	double getcost() {
	return q*prize*70;
	}
 void  addDessertItem() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter cookie quantity:");
		cookietorage=cookietorage+sc.nextInt();
	
}
 void displayDessertItem() {
		System.out.println("Dessert quantity  is :");
	    System.out.println(" cookie: "+ cookietorage);
	}

}



class icecream extends dessertItem{
	int q;
	int icestorage=60;
	double prize=50;	///in rupees
	icecream(int q)
	{
		icestorage=icestorage-q;
		this.q=q;
	}
	icecream(){
		
	}
	@Override
	double getcost() {
		
		return q*prize;
	}
	void  addDessertItem() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter icecream quantity:");
		icestorage=icestorage+sc.nextInt();
	}
	void displayDessertItem() {
		System.out.println("Dessert quantity is :");
	    System.out.println(" icecream: "+icestorage);
	}
	
}

public class dessertDemo {

	public static void main(String[] args) {
		String c="customer";
		String o="owner";
		System.out.println("Enter role of user customer/owner:");
		Scanner sc= new Scanner(System.in);
		String s=sc.next();
		if(s.equals(c))
		{
			System.out.println("you can place order for dessert:");
			System.out.println("Enter quantity for icecream(1 icecream = 50 rupee):");
			icecream i= new icecream(sc.nextInt());
			System.out.println("Enter quantity for candy(1 candy = 6 doller:");
			candy ca= new candy(sc.nextInt());
			System.out.println("Enter quantity for cookie(1 cookie = 5 euro):");
			cookie k= new cookie(sc.nextInt());
			double total=i.getcost()+ca.getcost()+k.getcost();
			System.out.println("Your total order amount is:"+total+"in Rupees");
			
			
			
		}
		else if(s.equals(o)) {
			while(true) {
			System.out.println("you can add items in dessert and display 1.add item \n 2.display 3.exit:");
			icecream i= new icecream();
			candy ca= new candy();
			cookie k= new cookie();
			Scanner sss= new Scanner(System.in);
			int ch=sss.nextInt();
;			switch(ch)
			{
			case 1: i.addDessertItem();
					ca.addDessertItem();
				    k.addDessertItem();
				    break;
			case 2: i.displayDessertItem();
					ca.displayDessertItem();
					k.displayDessertItem();
					break;
			case 3: System.exit(0);
					break;
			case 4:System.out.println("Inavlid entry....!");
					break;
					
			}
			}
			
			
		}
		else
		{
			System.out.println("Invalid input...!");
		}
		
	sc.close();	
	}

}
