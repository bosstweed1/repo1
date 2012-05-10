//Project Euler Number 5 Written By Andrew Beers

public class pe5
{
	public static void main (String [] args)
	{
		boolean start=true;
		int i=20;
		
		while(start)
		{
			i++;
			
			if(i%19 == 0 && i%17 == 0 && i%16 == 0 && i%13 == 0 &&i%11 == 0 && i%9 == 0 && i%7 == 0 && i%5 == 0 && i%4 == 0 && i%3 == 0 && i%2 == 0 )
				start = false;		
			
		}
			
		System.out.println("The answer is " + i);
			
	}
	
}