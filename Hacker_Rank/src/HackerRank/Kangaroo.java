package HackerRank;

import java.util.Scanner;

public class Kangaroo 
{

	static String solution(int x1, int v1, int x2, int v2) 
	{
		int i=x1,j=x2;
		while(i < j)
		{
			i = i + v1;
			j = j + v2;
		}
		if(i==j)
		{
			return "YES";
		}
		else
		{
			return "NO";
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter starting location of Kangaroo-1");
		int x1 = scan.nextInt();
		System.out.println("Enter jump meter of Kangaroo-1");
		int v1 = scan.nextInt();
		System.out.println("Enter starting location of Kangaroo-2");
		int x2 = scan.nextInt();
		System.out.println("Enter jump meter of Kangaroo-2");
		int v2 = scan.nextInt();
		
		System.out.println(solution(x1,v1,x2,v2));
	}
}
