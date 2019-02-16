package HackerRank;
import java.util.Scanner;

public class SuperReduceString 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String:");
		String s = scan.next();
		String t="";
		boolean flag=false;
		while(s.length()!=t.length())
		{
			if(flag)
			{
				s=t;
				t="";
			}
			flag=true;
			int i=0;
			for(;i<s.length()-1; i++)
			{
				if(s.charAt(i)==s.charAt(i+1))
				{
					i++;
				}
				else
				{
					t=t+s.charAt(i);
				}
			}
			if(i==s.length()-1)
			{
				t=t+s.charAt(i);
			}
		}
		if(t.length()==0)
		{
			System.out.println("Empty String");
		}
		else
		{
			System.out.println(t);
		}

	}

}
