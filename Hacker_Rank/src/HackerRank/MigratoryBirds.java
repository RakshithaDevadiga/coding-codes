package HackerRank;

import java.util.Scanner;

public class MigratoryBirds 
{
	static int solution(int[] ar) 
	{
		int birdCount[] = new int[5];
		for(int i=0; i<ar.length; i++)
		{
			birdCount[ar[i]-1]++;
		}
		int commonBird = 0, maxcount = 0;
		for(int i=0; i<5; i++)
		{
			if(birdCount[i] > maxcount)
			{
				commonBird = i;
				maxcount = birdCount[i];
			}
		}
		return commonBird+1;
	}
	
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of birds sighted");
		int n = scan.nextInt();
		int ar[] = new int[n];
		System.out.println("Enter the type-id of sited birds");
		for(int i=0; i<n; i++)
		{
			ar[i] = scan.nextInt();
		}
		int result = solution(ar);
		System.out.println(result);
	}
}

