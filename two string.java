package pack2;

import java.util.Scanner;

public class Second {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		String str1=input.nextLine();
		int num=str.length();
		int num1=str.length();
		String string="";
		int count=0;
		for(int i=1;i<num;i++)
		{
			for(int j=0;j<num;j++)
			{
				int x=i+j;
				if(x<=num)
				{
					string=str.substring(j, x);
				}
				if(string.length()>2)
				{
				if(str1.contains(string))
				{
					count++;
				}
			}
		}
		
	}
		if(count>0)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}
