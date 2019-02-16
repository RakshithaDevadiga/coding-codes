import java.util.Scanner;
public class HackerRankInString 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);		
		
		String hk="hackerrank";
		System.out.println("Enter number of String:");
		int n = scan.nextInt();
		String ar[] = new String[n];
		scan.nextLine();
		System.out.println("Enter the Strings one by one:");
		for(int i=0; i<n; i++)
		{
			ar[i] = scan.nextLine();
			ar[i]=ar[i].toLowerCase();
		}
		for(int k=0; k<n; k++)
		{
			int i=0,j=0;
			while(i<hk.length() && j<ar[k].length())
			{
				if(hk.charAt(i)==ar[k].charAt(j))
				{
					i++;
					j++;
				}
				else
				{
					j++;
				}
			}
			if(i==hk.length())
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}

