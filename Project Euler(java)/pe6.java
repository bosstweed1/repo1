//Project Euler Number 6 Written By Andrew Beers

public class pe6
{
	public static void main (String [] args)
	{
		int a=0,b=0,c;
		
		for(int i=0;i<100;i++)
		{
			a+=i*i;
			b+=i;
		}
		b=b*b;
		
		c = b-a;
		System.out.println("The answer is " + c);
			
	}
	
}// hopefully the answer can be stored as an int....