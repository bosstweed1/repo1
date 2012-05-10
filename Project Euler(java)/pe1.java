//Project Euler Number 1 Written By Andrew Beers

import java.util.*;

public class pe1
{
	
	public static void main(String [] args)
	{
		boolean cont=true;
		int a=0,sum=0;
		while(cont)
		{
			if(a%3 ==0)
				sum +=a;
			else if(a%5 ==0)
				sum +=a;
			else
				{}
				
			a++;
			if(a>=1000)
				cont = false;
			
		}
		
		System.out.println("Answer = " + sum);
	
	
	}
}