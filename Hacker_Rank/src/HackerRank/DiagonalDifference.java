package HackerRank;

import java.util.Scanner;

public class DiagonalDifference {
	
	
	static int diagonalDifference(int[][] arr) 
	{
        int d1=0,d2=0;
        for(int i=0;i<arr.length; i++)
        {
            for(int j=0;j<arr.length; j++)
           {
//            	checking for right diagonal
                if(i==j)
                {
                	d1+=arr[i][j];
                }
//                checking for left diagonal
                if(i+j==arr.length-1)
                {
                	d2+=arr[i][j];
                }
           }
        }
        if(d1>d2)
        {
            return d1-d2;
        }
        else
        {
            return d2-d1;
        }

    }

	public static void main(String[] args) 
	{
		System.out.println("Enter Size of array:");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("Enter Elements:");
		
//		creating a integer type 2D array 
		int ar[][] = new int[n][n];
		
//		taking array elements from the user
		for(int i=0; i<ar.length; i++)
		{
			for(int j=0; j<ar.length; j++)
			{
				ar[i][j] = scan.nextInt();
			}
		}
		
		int result = diagonalDifference(ar);
		System.out.println(result);
	}
}
