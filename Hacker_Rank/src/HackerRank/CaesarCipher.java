package HackerRank;


import java.util.Scanner;

public class CaesarCipher 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		//Taking input String
		System.out.println("Enter String:");
		String s = scan.nextLine();
		//Taking integer input 
		int k=scan.nextInt();
		k=k%26;				//to avoid overflow
		String t="";		//creating empty string
		
		//traversing the string to get the result
		for (int i = 0; i < s.length(); i++) 
		{
			// to do the operation only for alphabets
			if((s.charAt(i)>=65 && s.charAt(i)<=90)
				||(s.charAt(i)>=97 && s.charAt(i)<=122))
			{
				if((s.charAt(i)>=65 && s.charAt(i)<=90-k)
						||(s.charAt(i)>=97 && s.charAt(i)<=122-k))
				{
					t=t+(char)(s.charAt(i)+k);
				}
				//if the range goes beyond z or Z while adding k.
				else
				{
					t=t+(char)(s.charAt(i)+k-26);
				}
			}
			//if not alphabets(numbers and special characters)
			else
			{
				t=t+s.charAt(i);
			}
		}
		System.out.println(t);
	}

}
