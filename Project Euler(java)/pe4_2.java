//Project Euler Number 4 Written By Andrew Beers
//Find the largest palindrome of the multiplication of 2 3 digit numbers;

//This version gives the correct output
import java.util.*;
import java.lang.*;
public class pe4_2
{
	public static void main (String [] args)
	{
		ArrayList list = new ArrayList<Integer>(32);
		boolean again=true,first=true,second=false;
		int c,count=0,j=0,i=0;
		Integer max;
		
		String k,l;
		//as opposed to trying to think about it as in example 1, ill just exhaustively try all possibilities;
		for(int a=100;a<1000;a++)
		{
			for(int b=100;b<1000;b++)
			{
			
				c = a*b;
				k =Integer.toString(c);
				l = reverse(k);
			
				if(l.equals(k))
				{
					list.add(Integer.parseInt(k));
					i++;
				}
			}
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