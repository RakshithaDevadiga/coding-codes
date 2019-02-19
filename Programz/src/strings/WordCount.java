package strings;
import java.util.Scanner;

public class WordCount {

		public static void main(String[] args) 
		{
			Scanner scn=new Scanner(System.in);
			System.out.println("enter a string");
			String s=scn.nextLine();
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)==' '&& s.charAt(i+1)!=' ')
					count++;
			}
	      System.out.println("no of words= "+(count+1));
		}
	}
