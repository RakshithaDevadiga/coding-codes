package strings;
import java.util.Scanner;

public class Panagram
{
	public static void main(String[] args) 
	 {
			Scanner scn=new Scanner(System.in);
			System.out.println("Enter a string");
			String s=scn.nextLine();
			s=removeUnwanted(s);
			if(s.length()>=26)
			{
				s=lowerCase(s);
				s=sort(s);
				s=removeDuplicates(s);
				if(s.length()==26)
				{
					System.out.println("Panagram");
				}
				else
				{
					System.out.println("Not Panagram");
				}
			}

			else
			{
				System.out.println("Not Panagram");
			}
	 }		
	//to remove other than character
	static String removeUnwanted(String s)
	{
		String temp="";
		for(int i=0;i<s.length();i++)
        {
			if((s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122))
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
	
	//sorting method
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
	
	//to remove duplicate method
	static String removeDuplicates(String s)
	{
		String temp="";
		for(int i=0;i<s.length()-1;i++)
		{
		  if(s.charAt(i)!=s.charAt(i+1))
		  {
			  temp+=s.charAt(i);
		  }
		}
		temp+=s.charAt(s.length()-1);
		return temp;
		
	}
	
}
