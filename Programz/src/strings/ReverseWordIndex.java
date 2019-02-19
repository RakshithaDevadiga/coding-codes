package strings;
import java.util.Scanner;

public class ReverseWordIndex 
{
	public static void main(String[] args) 
	 {
			Scanner scn=new Scanner(System.in);
			System.out.println("Enter the string");
			String s=scn.nextLine();
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
				{
					count++;
				}
			}
			String[] ar=new String[count+1];
			int j=0;
			String temp="";
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)!=' ')
				{
					temp+=s.charAt(i);
				}
				else if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
				{
					ar[j]=temp;
					j++;
					temp="";
				}
			}
			ar[j]=temp;
			temp="";
			for(int i=0;i<ar.length-1;i++)
			{
				temp+=reverse(ar[i])+" ";
			}
			temp+=reverse(ar[ar.length-1]);
			System.out.println(temp);
	 }
			
			static String reverse(String s)
			{
				String temp="";
				for(int i=s.length()-1;i>=0;i--)
				{
					temp+=s.charAt(i);	
				}

				return temp;

			}

}

	