package strings;
import java.util.Scanner;

public class AddNum {
		    public static void main(String[] args) {
			Scanner scn=new Scanner(System.in);
			System.out.println("Enter the string");
			String s=scn.nextLine();
			scn.close();
			int sum=0;
			String temp="";
			for(int i=0;i<s.length();i++)
			{
				if((s.charAt(i)>=65&&s.charAt(i)<=90)||(s.charAt(i)>=97&&s.charAt(i)<=122))
		        temp+=s.charAt(i);
				else if(s.charAt(i)>=48&&s.charAt(i)<=57)
	            sum+=s.charAt(i)-48;
				else if(s.charAt(i)==' ')
				{
					temp+=sum+" ";
					sum=0;
				}
			}

			temp+=sum;
			System.out.println(temp);

		}

	}

