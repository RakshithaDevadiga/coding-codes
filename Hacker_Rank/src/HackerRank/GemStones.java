package HackerRank;

import java.util.Scanner;

public class GemStones
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number of Strings:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
//		creating String type array
		String ar[] = new String[n];
		System.out.println("Enter Strings one by one");
		scan.nextLine();
		int mineralCount;
		int gemCount=0;
//		taking input strings from the user
		for(int i=0; i<n; i++)
		{
			ar[i] = scan.nextLine();
		}
		
//		outer for loop to compare all lowercase characters
		for(char c = 'a' ; c <= 'z'; c++)
		{
			mineralCount=0;
			
//			inner for loop to check if the character exist in all the strings
			for(int i=0 ; i < ar.length; i++)
			{
				if(ar[i].indexOf(c)>-1)
				{
					mineralCount++;
				}
				else
				{
					break;
				}	
			}
				
			if(mineralCount==n)
			{
				gemCount++;
			}
		}
		System.out.println(gemCount);
	}

}
