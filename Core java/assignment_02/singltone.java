package assignment2;

class singltone {
	private static singltone obj=null;
	public String s;
	private singltone()
	{
		s="Hello World";
	}
	public static singltone getInstance() {
		if(obj==null) {
			obj=new singltone();
		}
		return obj;
	}
	
	public static void main(String args[]) {
		singltone obj1=singltone.getInstance();
		System.out.println(obj1.s);
		obj1.s="hiiiii";
		singltone obj2=singltone.getInstance();
		System.out.println(obj2.s);
	}

}
