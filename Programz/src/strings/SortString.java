package strings;
import java.util.Scanner;

public class SortString {

		public static void main(String[] args) 
		{
			Scanner scn=new Scanner(System.in);
			System.out.println("enter string");
			String s=scn.next();
			char[] ar=s.toCharArray();
			for(int i=0;i<ar.length-1;i++)
			{
				for(int j=i+1;j<ar.length;j++)
				{
					if(ar[i]>ar[j])
					{
						char t=ar[i];
						ar[i]=ar[j];
						ar[j]=t;
					}
				}
			}
	String temp="";
	for(int i=0;i<ar.length;i++)
			{
		temp+=ar[i];
			}
	System.out.println(temp);
		}
	}

