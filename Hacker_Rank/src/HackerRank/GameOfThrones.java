package HackerRank;

import java.util.Scanner;

public class GameOfThrones 
{
	
	static String sort(String s) 
	{
		char ar[] = s.toCharArray();
		for(int i=0;i<ar.length-1; i++)
		{
			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[i] > ar[j])
				{
					char t= ar[i];
					ar[i] = ar[j];
					ar[j] = t;
				}
			}
		}
		
		String t="";
		for(int i=0; i<ar.length; i++)
		{
			t = t+ar[i];
		}
		return t;
	}
	
	
	static boolean checkPossiblePalindrome(String s) 
	{
		boolean oddFlag = false;
		int i=0;
		for(; i<s.length()-1; i++)
		{
			if(s.charAt(i) == s.charAt(i+1))
			{
				i++;
			}
			else
			{
				if(oddFlag == true)
				{
					return false;
				}
				else
				{
					oddFlag = true;
				}
			}	
		}
		if(i==s.length()-1 && oddFlag == true)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Enter String:");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		s = sort(s);
		boolean result = checkPossiblePalindrome(s);
		if(result)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}
