package HackerRank;

import java.util.Scanner;

public class BirthdayBar 
{
	public static void main(String[] args)
	{
		System.out.println("Enter number of Squares in chocolate bar:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int ar[] = new int[n];
		
		System.out.println("Enter numbers in chocolate square");
		
		for(int i=0; i<ar.length; i++)
		{
			ar[i] = scan.nextInt();
		}
		
		System.out.println("Enter Ron's birth day");
		int d = scan.nextInt();
		
		System.out.println("Enter Ron's birth month");
		int m = scan.nextInt();
				
		int result = solution(n,ar,d,m);
		
		System.out.println(result);
	}

	static int solution(int n, int[] ar, int d, int m) 
	{
		int count=0;
		for(int i=0; i<=ar.length-m; i++)
		{
			int sum = 0;
			for(int j=i; j<i+m; j++)
			{
				sum = sum + ar[j];
			}
			if(sum == d)
			{
				count++;
			}
		}
		return count;
	}
}

