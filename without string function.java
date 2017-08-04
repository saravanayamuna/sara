import java.util.Scanner;


public class concat {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		String str1=input.next();
		String str2=input.next();
		int len=str1.length()+str2.length();
		char ch[]=new char[len];
		int j=0;
		for(int i=0;i<str1.length();i++,j++)
		{
			ch[j]=str1.charAt(i);
		}
		int m=j;
		for(int i=0;i<str2.length();i++)
		{
			ch[m]=str2.charAt(i);
			m++;
		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
	}

}
