//Project Euler Number 2 Written By Andrew Beers

public class pe2
{
	public static void main (String [] args)
	{
		boolean large=true;
		int sum1=0,sum2=1,sum3=0,result=0;
		
		while(large)
		{
			sum3 = sum1;
			sum1=sum2;
			sum2= sum3+sum2;
			
			if(sum2>4000000)
			{
				large=false;
				break;
			}
			
			if(sum2%2 == 0)
			{
				result+=sum2;
			}
			
			
		}
		
		System.out.println("The answer is = " + result);
		
	
	}
	
}