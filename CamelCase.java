package remo;

import java.util.*;

public class loo {
	public static void main(String [] args)
	{
	Scanner input=new Scanner(System.in);
	String str=input.nextLine();
	char [] ch=str.toCharArray();
	boolean sar=true;
	int c=0;
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]==' ')
		{
			if(Character.isUpperCase(ch[i+1]))
			c++;
			else
			sar=false;
		}
	}
	    if(sar&&Character.isUpperCase(ch[0]))
		System.out.println("yes");
	    else
		System.out.println("no");
}}
