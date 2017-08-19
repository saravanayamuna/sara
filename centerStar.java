package test1;

import java.util.Scanner;

public class saravana {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		char [] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(i<ch.length-1)
			{
		if(ch[i]==ch[i+1])
		{
			System.out.print(ch[i]);
			System.out.print("*");
		}
		else
		{
			System.out.print(ch[i]);
		}
			}
		}
			System.out.print(ch[ch.length-1]);
		
		
		
	}

}
