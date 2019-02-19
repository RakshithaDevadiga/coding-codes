package strings;

import java.util.Scanner;

public class Anagram
{
	public static void main(String[] args) 
	 {
			Scanner scn=new Scanner(System.in);
			System.out.println("Enter first string");
			String s1=scn.nextLine();
			System.out.println("Enter second string");
			String s2=scn.nextLine();
			s1=removeSpace(s1);
			s2=removeSpace(s2);
			if(s1.length()==s2.length())
			{
				s1=lowerCase(s1);
				s2=lowerCase(s2);
				s1=sort(s1);
				s2=sort(s2);
				for(int i=0;i<s2.length();i++)
				{
				if(s1.charAt(i)!=s2.charAt(i))
				{
					System.out.println("Not Anagram");
					return;
				}
				}
				System.out.println("Anagram");
			}
				else
				{
					System.out.println("Not Anagram");
				}
		}
	
	//Remove Space
	static String removeSpace(String s)
	{
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				temp+=s.charAt(i);
			}
		}
		return temp;
	}
	
	//convert all to upper case
		static String lowerCase(String s)
		{
			String temp="";
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)>=65 && s.charAt(i)<=90)
				{
					temp+=(char)(s.charAt(i)+32);
				}
				else
				{
					temp+=s.charAt(i);
				}
			}
			return temp;
		}
		
	//sorting both the strings
		static String sort(String s)
		{
		 String temp="";
		char[] ar=s.toCharArray();
		for(int i=0;i<ar.length-1;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					char t=ar[i];
					ar[i]=ar[j];
					ar[j]=t;
				}
			}
		}
	    for(int i=0;i<ar.length;i++)
		 {
	       temp+=ar[i];
		 }
	     return(temp);
		}
}
