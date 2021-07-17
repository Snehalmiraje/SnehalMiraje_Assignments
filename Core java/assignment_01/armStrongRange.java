package assignment1;



public class armStrongRange {
	public static void main(String[] args) {

		int i;
		checker ch=new checker();
		for(i=100;i<=999;i++)
			if(ch.checkarmstrong(i)==1)
				System.out.println(" "+i);

	}
	
}
class checker
{
	int checkarmstrong(int num)
	{
		int sum=0;
		int tmp=num;
		while(num>0)
		{
			sum=sum+(int)(Math.pow(num%10,3));
			num=num/10;
		}
		if(sum==tmp)
			return 1;
		return 0 ;
	}
}
