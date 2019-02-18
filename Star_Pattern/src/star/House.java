package star;

import java.util.Scanner;
public class House 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enetr no of rows");
		int n=scn.nextInt();
       
		for(int i=0;i<n;i++)
		{
	        for(int j=0;j<n-1-i;j++)
			{
               System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
               System.out.print("#");
			}
			for(int j=0;j<i;j++)
			{
               System.out.print("#");
			}
			for(int j=0;j<n-1-i;j++)
			{
               System.out.print("#");
			}
			for(int j=0;j<n;j++)
			{
               System.out.print("#");
			}
			for(int j=0;j<n;j++)
			{
               System.out.print("#");
			}
			for(int j=0;j<n;j++)
			{
               System.out.print("#");
			}
			for(int j=0;j<=i+1;j++)
			{
               System.out.print("#");
			}
			System.out.println();
		}
     
	 for(int i=0;i<n;i++)
		{
	        for(int j=0;j<n;j++)
			{ 
				if(j==0)
			   System.out.print("|");
				else if(i==n-1&&(n/4<j))
			   System.out.print("_");
                else
               System.out.print(" ");
			}
			for(int j=0;j<n;j++)
			{
				if(j==n-1)
			   System.out.print("|");
				else if(i==n-1&&(j<(3*n)/4))
			   System.out.print("_");
				else
               System.out.print(" ");
			}
			for(int j=0;j<n;j++)
			{
               System.out.print(" ");
			}
			for(int j=0;j<n;j++)
			{
               System.out.print(" ");
			}
			for(int j=0;j<n;j++)
			{ 
				if(j==0&&i<n/2||j==n/2&&i<n/2)
               System.out.print("!");
                else if(i==0&&j<n/2||i==n/2&&j<=n/2||i==n/4&&j<=n/2)
			   System.out.print("^");
				else 
			   System.out.print(" ");
			}
			for(int j=0;j<n;j++)
			{
				if(j==n-1)
			   System.out.print("|");
				else
               System.out.print(" ");
			}
			System.out.println();
		}

		for(int i=0;i<n;i++)
		{
	        for(int j=0;j<n;j++)
			{ 
				if(j==0)
			   System.out.print("|");
				else if(i==n-1)
			   System.out.print("_");
				else if(j==n/4)
			   System.out.print("|");
                else
               System.out.print(" ");
			}
			for(int j=0;j<n;j++)
			{
				if(j==n-1)
			   System.out.print("|");
				else if(i==n-1)
			   System.out.print("_");
				else if(j==((3*n)/4))
			   System.out.print("|");
				else
               System.out.print(" ");
			}
			for(int j=0;j<n;j++)
			{
				if(i==n-1)
			   System.out.print("_");
				else
               System.out.print(" ");
			}
			for(int j=0;j<n;j++)
			{
               if(i==n-1)
			   System.out.print("_");
				else
               System.out.print(" ");
			}
			for(int j=0;j<n;j++)
			{ 
			   if(i==n-1)
			   System.out.print("_");
				else
               System.out.print(" ");
			}
			for(int j=0;j<n;j++)
			{
				if(j==n-1)
			   System.out.print("|");
				else if(i==n-1)
			   System.out.print("_");
				else
               System.out.print(" ");
			}
			System.out.println();
		}
		
 


	}
}

