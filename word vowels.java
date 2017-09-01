package meena;

import java.util.Scanner;

public class vowels {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		String s=input.nextLine();
		String [] str=s.split(" ");
		int count=0,max=0;
		String ans="";
		for(int i=0;i<str.length;i++)
		{
			String s1=str[i];
			char [] c=str[i].toCharArray();
			for(int j=0;j<c.length;j++)
			{
				if(c[j]=='a'||c[j]=='e'||c[j]=='i'||c[j]=='o'||c[j]=='u')
				{
					count++;
				}
			}
			if(count>max)
			{
				max=count;
				 ans=s1;
			}
		}
		System.out.println(ans);
	}

}
