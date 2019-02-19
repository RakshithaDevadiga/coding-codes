package strings;
import java.util.Scanner;

public class Occurrences {
		static String toLower(String s)
		{
			String temp="";
			for(int i=0;i<s.length();i++)
			{
			if(s.charAt(i)>=65 && s.charAt(i)<=90)
				temp+=s.charAt(i)+32;
			else
				temp+=s.charAt(i);
			}
			return temp;
		}
		
		static String sort(String s)
		{
			char[] ar=s.toCharArray();
			String temp="";
		    for(int i=0;i<s.length()-1;i++)
		    {
		    	for(int j=i+1;j<s.length();j++)
		    	{
		    		if(ar[i]>ar[j])
		    		{
		    			char t=ar[i];
		    			ar[i]=ar[j];
		    			ar[j]=t;
		    		}
		    	}
		    }
			for(int i=0;i<s.length();i++)
			{
				temp+=ar[i];
			}
			return temp;
		}

		public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=scn.nextLine();
		int count=0;
		scn.close();
		s=toLower(s);
		s=sort(s);
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				count++;
			}
			else
			{
				count+=1;
				System.out.println(s.charAt(i)+" comes "+count+" times ");
				count=0;
			}
		}
		System.out.println(s.charAt(s.length()-1)+" comes "+(count+1)+" times ");
		}

	}

