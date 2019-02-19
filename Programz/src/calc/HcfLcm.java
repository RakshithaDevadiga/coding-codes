package calc;

import java.util.Scanner;
public class HcfLcm {

	public static void main(String[] args)
	{
		int n1,n2,temp,gcd,lcm,a,b;
		Scanner scn=new Scanner(System.in);
		 System.out.println("enter two numbers");
		  n1 = scn.nextInt(); 
		  n2 = scn.nextInt(); 
		 scn.close();
		 
		 a=n1;
		 b=n2;
		 
		 while(b!=0)
			 {
				 temp=b;
				 b=a%b;
				 a=temp;
			 }
		 gcd=a;
		 lcm=(n1*n2)/gcd;
		 
		 System.out.println("hcf of "+n1+" and "+n2+" is "+gcd);
		 System.out.println("lcm of "+n1+" and "+n2+" is "+lcm);
				 

	}

}
