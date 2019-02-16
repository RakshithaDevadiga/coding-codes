package HackerRank;

import java.util.Scanner;

public class FunnyString 
{
	
	static String funnyString(String s) 
    {
        int ar[] = new int[s.length()-1];
        for(int i=0; i<s.length()-1; i++)
        {
            ar[i]=s.charAt(i)-s.charAt(i+1);
        }
        for(int i=0,j=ar.length-1; i<j ; i++,j--)
        {
            if(ar[i] != ar[j] && ar[i] != -ar[j] )
            {
                return "Not Funny";
            }
        }
        return "Funny";
    }
	
	
	public static void main(String[] args) 
	{
		System.out.println("Enter String:");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String result = funnyString(s);
		System.out.println(result);

	}

}

