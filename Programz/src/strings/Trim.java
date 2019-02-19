package strings;
import java.util.Scanner;

public class Trim {
	
		public static void main(String[] args) 
		{
			Scanner scn=new Scanner(System.in);
			System.out.println("enter a string");
			String s=scn.nextLine();
			String temp="";
			int st=0;
			int ed=0;

			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)!=' ')
				{
					st=i;
					break;
				}
			}

			for(int i=s.length()-1;i>=0;i--)
			{
				if(s.charAt(i)!=' ')
				{
					ed=i;
					break;
				}
			}
			for(int i=st;i<ed;i++)
			{
				temp+=s.charAt(i);
			}
			System.out.println(temp);
		}
	}

			
