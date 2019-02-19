package calc;

import java.util.Scanner;

//Java Program for the binary 
//representation of a given number 
public class Binary
{ 
static void bin(int n) 
{ 
	/* step 1 */
	if (n > 1) 
		bin(n/2); 

	/* step 2 */
	System.out.print(n % 2); 
} 

//Driver code 
public static void main(String[] args) 
{ 
	 
	Scanner scn=new Scanner(System.in);
	 System.out.println("enter the number");
	 int n = scn.nextInt(); 
	 scn.close();
	 bin(n);
} 
} 

