package calc;
import java.util.Scanner;

public class NearestPrime {
	
		public static boolean nPrime(int n) 
		{
			int k=0;
			
			for(int j=1;j<=n;j++)
			{
			if(n%j==0) 
			  {	
				k++;
			  }
			} 
		  if(k==2)
			   return true;
			else
				return false;
		}
		
		

		public static void main(String[] args)
		{
			int n;
			Scanner scn=new Scanner(System.in);
			 System.out.println("enter number");
			  n = scn.nextInt(); 
			 scn.close();
			 
			 for(int i=n-1;i>0;i--)
			 {
				 if(nPrime(i)) 
				 {
					 System.out.print(i+" and ");
					break;
				 }
			 }
			 
			 for(int i=n+1;;i++)
			 {
				 if(nPrime(i)) 
				 {
					 System.out.print(i);
					break;
				 }
			 }
			 
		
		}

	}

