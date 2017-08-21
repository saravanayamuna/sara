import java.util.Scanner;


public class brackets
{
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.next();
		String copy1=str;
		String c="";
		String copy="";
		char [] ch=copy1.toCharArray();
		int flag=0;
		StringBuffer bs=new StringBuffer(copy1);
		String ss=bs.reverse().toString();
		if(ss.equals(str))
		{
			System.out.println("there is no need for remove character given string aready palindrome");
		}
		else
		{
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				if(j!=i)
				{
					c=c+ch[j];
				}
			}
			String co=c;
			StringBuffer sb=new StringBuffer(co);
			copy=sb.reverse().toString();
			if(c.equals(copy))
			{
				flag=1;
				System.out.print("character should be removed " +ch[i]);
				System.out.println( "  index at  " +i);
			}
			c="";
			//System.out.println();
		}
		if(flag==0)
		{
			System.out.println("there is no possibility for palindrome");
		}
		}
	}	
	}
	


