package star;

import java.util.Scanner;
public class MyName
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int n=scn.nextInt();
		for(int i=0;i<n;i++)
		{
			
			
	//R
			for(int j=0;j<n;j++)
			{
				
				if(j==0||((i==0||i==n/2)&&j<n/2)||(j==n/2&&(i!=0&&i!=n/2&&i<n/2))||i-j==n/2)
				{
			System.out.print("*");
				}
				else
				{
             System.out.print(" ");
			     }
			}

    //A
			for(int j=0;j<n;j++)
			{
				if((i==0||i==n/2)&&(j>0&&j<n/2)||(j==0||j==n/2)&&(i!=0))
				{
			System.out.print("*");
				}
				else
				{
             System.out.print(" ");
			     }
			}
    //K
           for(int j=0;j<n;j++)
			{
				if(j==0||i+j==n/2||i-j==n/2)
				{
			System.out.print("*");
				}
				else
				{
             System.out.print(" ");
			     }
			}
   //S
          for(int j=0;j<n;j++)
			{
                if((i==0&&j!=0&&j<n/2)||(i==n-1&&j!=0&&j<n/2)||(i==n/2&&j!=0&&j<n/2)||(j==0&&i<n/2&&i!=0)||(j==n/2&&i>n/2&&i!=n-1))
				{
			System.out.print("*");
				}
				else
				{
             System.out.print(" ");
			     }
			}
	//H
	      for(int j=0;j<n;j++)
			{
				if(j==0||j==n/2||i==n/2&&j<n/2)
				{
			System.out.print("*");
				}
				else
				{
             System.out.print(" ");
			     }
			}
   //I
           for(int j=0;j<n;j++)
			{
				if(j==(n/4)||(i==0||i==n-1)&&j<n/2)
				{
			System.out.print("*");
				}
				else
				{
             System.out.print(" ");
			     }
			}
  //T
        for(int j=0;j<n;j++)
			{
				if(j==n/4||i==0&&j<n/2)
				{
			System.out.print("*");
				}
				else
				{
             System.out.print(" ");
			     }
			}
	//H
	     for(int j=0;j<n;j++)
			{
				if(j==0||j==n/2||i==n/2&&j<n/2)
				{
			System.out.print("*");
				}
				else
				{
             System.out.print(" ");
			     }
			}
    //A
	    for(int j=0;j<n;j++)
			{
				if((i==0||i==n/2)&&(j>0&&j<n/2)||(j==0||j==n/2)&&(i!=0))
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
