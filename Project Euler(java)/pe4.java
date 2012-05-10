//Project Euler Number 4 Written By Andrew Beers
//Find the largest palindrome of the multiplication of 2 3 digit numbers;

//this version gives incorrect output(I still think its cool. Its a different way to look at it and to see how wordy the code can get if you are doing something inefficiently
import java.util.*;
import java.lang.*;
public class pe4
{
	public static void main (String [] args)
	{
		ArrayList list = new ArrayList<Integer>(32);
		boolean again=true,first=true,second=false;
		int a=999,b=999,c,count=0,j=0,i=0;
		Integer max;
		
		String k,l;
		
		while(again)
		{
			
			c = a*b;
			k =Integer.toString(c);
			l = reverse(k);
			
			if(l.equals(k))
			{
				list.add(Integer.parseInt(k));
				i++;
			}
			
			//first loop 999*(1-999)
			if(first)
				a--;
			
			//second loop 999*998->998*998->998*997->...->101*100.
			if(second)
			{
				if(count%2==0)
					a--;
				else
					b--;
			}
			
			
			//this is the terminal condition for 'first', a is decremented from 100 and is no longer 3 digits so we must reset
			if(a==99)
			{
				a=999;
				first = false;
				second = true;
			}
			//this is the terminal condition for 'second'
			//since b decrements after a, this is will process 100*101, but not 100*100, but 100 * 100 is clearly not a palindrome
			//This condition is satisfied before a =99 so no problems there.
			if(b==100)
			{
				again = false;
			}
			
			
			count++;
			
		}
		
		max = (Integer)list.get(0);
		for(j=1;j<i;j++)
		{
			if((Integer)list.get(j)>max)
			{
				max = (Integer)list.get(j);
			}
		}
		
	
		
		System.out.println("The answer is = " + max);
	
	}
	
	public static String reverse(String k)
	{
		StringBuffer s = new StringBuffer(k);
		StringBuffer s1;
		String s2;
		s1= s.reverse();
		s2 = s1.toString();
		return s2;
	}
			
	
}