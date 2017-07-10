package pack2;

import java.util.Scanner;

public class poll {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		int len=str.length();
		String langth="";
		int number=langth.length();
		String reset="";
		String answer="";
		for(int i=1;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
			int x=i+j;
			if(x<=len)
			{
				 reset=str.substring(j,x);
				 if(reset.length()>2)
				 {
					 String sum=reset;
				 String copy="";
					 StringBuffer sb=new StringBuffer(reset);
					 copy=copy+sb.reverse();
					 if(copy.equals(sum))
					 {
						 if(sum.length()>number)
						 {
                          number=sum.length();
							 answer=sum;
						 }}}}}}
	System.out.println(""+answer);
}}
