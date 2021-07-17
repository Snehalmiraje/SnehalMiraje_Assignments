package assignment3;
import java.util.*;
import java.util.Map.Entry;
class Emp{
	int id;
	Emp(int id){
		this.id=id;
	}
	@Override
	public int hashCode() {
		return 15;
	}

	@Override
	public boolean equals(Object obj) {
			return true;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
public class Demoemployee {

	public static void main(String[] args) {
		Hashtable<Emp,String> h=new Hashtable<>();
		Emp e1=new Emp(101);
		Emp e2=new Emp(102);
		h.put(e1, "snehal");
		h.put(e1, "sachin");
		h.put(e2, "A");
		h.put(e2, "B");
		
		System.out.println("size is:"+h.size()); //////this return size 1 instead of 4 that means hashcode is same:
		System.out.println("_____________________");
		
		
		Set<Entry<Emp,String>> entryset=h.entrySet();
		for (Entry<Emp,String> e :entryset) {
			Emp keys=e.getKey();
			System.out.println("Key is :"+keys);
			System.out.println("value is :"+e.getValue());
		}
		
		System.out.println("___________________________________");
		Set<Emp> key=h.keySet();
		
		//System.out.println("Value at key employee e2 : "+h.get(e2));
		for(Emp k:key) {
			System.out.println("key: " +k);
			System.out.println("value: "+h.get(k));
		}
		
	}

}
