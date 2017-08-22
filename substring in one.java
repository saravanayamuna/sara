package edu.ksr.inter;

import java.util.Scanner;

public class Two {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the string one");
		String str1=input.nextLine();
		System.out.println("Enter the string two");
		String str2=input.next();
		if(str1.contains(str2))
		{
			System.out.println(str1.indexOf(str2));
		}
		else
		{
			System.out.println("-1");
		}
	}

}
