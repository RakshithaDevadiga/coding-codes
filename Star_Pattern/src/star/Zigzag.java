package star;

import java.util.Scanner;
public class Zigzag
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int n=scn.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				
				if(i==0||i==n/2||i==n-1||j==0||j==n/2||j==n-1||i==j||i+j==n-1||j-i==n/2||i-j==n/2||i+j==(n+n/2)-1||i+j==n/2)
				{
			System.out.print("*");
				}
				else
				{
             System.out.print(" ");
			     }
			}
			
	        System.out.println();
		}
	}
}