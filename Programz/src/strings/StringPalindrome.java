package strings;
import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter");
		String s=scn.nextLine();
		for(int i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-1-i))
			{
				System.out.println("not palindrome");
				return;
			}
		}
System.out.println(" palindrome");
	}
}
