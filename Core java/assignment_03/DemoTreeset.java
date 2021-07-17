package assignment3;
import java.util.*;

class person {
	String name;
	double height;
	double weight;
	person()
	{
		
	}
	person(String n,double h,double w){
		this.name=n;
		this.height=h;
		this.weight=w;
	}
	
	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

}
class my implements Comparator<Object>{
	@Override
public int compare(Object o, Object o1) {
		
		person p=(person)o;
		person q=(person)o1;		
		if(p.getName()==q.getName())
		{
			if(p.getHeight()==q.getHeight())
			{
				if(p.getWeight()!=q.getWeight())
					return  p.getWeight()>q.getWeight()?1:-1;
			}
			else
				return p.getHeight()>q.getHeight()?1:-1;
		}
		else
			return p.getName().compareTo(q.getName());
  return 0;
	}
	

}

public class DemoTreeset {

	public static void main(String[] args) {
		
		
		TreeSet<person> Treeset= new TreeSet<person>(new my());
		Treeset.add(new person("snehal",5,51));
		Treeset.add(new person("sachin",5.6,65));
		Treeset.add(new person("snehal",5,50));
		Treeset.add(new person("revati",5.3,55));
		//System.out.println(Treeset);
		for (person p: Treeset)
		System.out.println("treeset data is:"+ p.getName()+" "+p.getHeight()+" "+p.getWeight());
		
	}

}
