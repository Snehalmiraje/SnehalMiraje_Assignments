package assignment2;

abstract class persistance{
	abstract void  persist();
}

class filepersistance extends persistance{

	@Override
	void persist() {
		System.out.println("I am in file....data stored in file!");

	}
	
}
class databasepersistance extends persistance{

	@Override
	void persist() {
		System.out.println("I am in database...data stored in database! ");
		
	}
	
}
public class  persistanceDemo {

	public static void main(String[] args) {
		int rand = (int)(Math.random() * 3) ;
		//System.out.println(rand);
	       if (rand == 0 || rand==1){
	    	   filepersistance f= new filepersistance();
	    	   f.persist();
	            
	         } else if (rand == 2){
	            	databasepersistance f= new databasepersistance();
	  	    	   f.persist();
	  	               
	               
	            } 
	       
	}

}
