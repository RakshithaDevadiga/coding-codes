package HackerRank;

import java.util.Scanner;

public class MarsExploration 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter String:");
		Scanner scan = new Scanner(System.in);
		String message =scan.nextLine();
		int mistake = 0;
		for(int i=0; i<message.length(); i=i+3)
		{
			if(i%3==0 && message.charAt(i)!='S')
			{
				mistake++;
			}	
			if((i+1)%3==1 && message.charAt(i+1)!='O')
			{	
				mistake++;
			}
			if((i+2)%3==2 && message.charAt(i+2)!='S')
			{
				mistake++;
			}
		}
		System.out.println(mistake);
	}
}

