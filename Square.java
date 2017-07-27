import java.util.Arrays;
import java.util.Scanner;


public class Last {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=input.nextLine();
		char [] ch=str.toCharArray();
		String s="";
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isDigit(ch[i]))
			{
				s=s+ch[i];
			}
		}
	   int [] t1=new int[s.length()];
		char [] c=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
		t1[i]=(int)c[i]-48;
			}
		Arrays.sort(t1);
		int num=t1[t1.length-1];
		int num1=t1[0];
		int sum=0,b=0,sum1=1;
		for(int i=0;i<t1.length;i++)
		{
			sum=sum+(t1[i]*num);
		}
		int copy=sum;
		while(copy>=10)
		{
			sum=copy;
			b=0;
			
		while(sum>0)
		{
			int a=sum%10;
			b=b+a;
			sum=sum/10;
		}
		copy=b;
		}
		for(int i=0;i<t1.length;i++)
		{
			sum1=sum1*(t1[i]+num1);
		}
		int copy1=sum1;
		while(copy1>=10)
		{
			sum1=copy1;
			b=0;
			
		while(sum1>0)
		{
			int a=sum1%10;
			b=b+a;
			sum1=sum1/10;
		}
		copy1=b;
		}
		int output=0;
		if(copy1<copy)
		{
			output=copy1*copy1;
		}
		else
		{
			output=copy*copy;
		}
		System.out.println("output is "+output);
	}
}
