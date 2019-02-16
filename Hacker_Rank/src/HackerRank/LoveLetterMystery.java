import java.util.Scanner;

public class LoveLetterMystery 
{
	static int theLoveLetterMystery(String s) 
	{
		int count=0;
		for(int i=0,j=s.length()-1; i < j; i++,j--)
		{
			if(s.charAt(i) > s.charAt(j))
			{
				count = count + (s.charAt(i) - s.charAt(j));
			}
			else
			{
				count = count + (s.charAt(j) - s.charAt(i));
			}
		}
		return count;
	}
	
	public static void main(String[] args) 
	{
//		System.out.println("Enter number of strings:");
		Scanner scan =new Scanner(System.in);
		int n = scan.nextInt();
		String ar[] = new String[n];
		for(int i=0; i<n; i++)
		{
			ar[i] = scan.next();
		}
		for(int i=0; i<n; i++)
		{
			System.out.println(theLoveLetterMystery(ar[i]));;
		}
	}

}
