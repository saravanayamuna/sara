import java.util.Scanner;


public class lowSub {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.next();
		int count=0;
		String ss="";
		for(int i=1;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				int x=i+j;
				if(x<=str.length())
				{
					String s=str.substring(j, x);
					int len=s.length();
					if(len>count)
					{
						count=len;
						ss=s;
					}
				}
			}}
		System.out.println(ss);
	}

}
