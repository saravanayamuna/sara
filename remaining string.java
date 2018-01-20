package remo;

import java.util.*;

public class loo {
	public static void main(String [] args)
	{
	Scanner input=new Scanner(System.in);
	String str=input.nextLine();
	char ch[]=str.toCharArray();
	int count=0;
	for(int i=0;i<ch.length;i++)
	{
		count=0;
		for(int j=0;j<ch.length;j++)
		{
			if(i!=j&&ch[i]==ch[j])
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.print(""+ch[i]);
		}
	}
	}

}
