import java.util.Scanner;


public class swap {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		char []ch=str.toCharArray();
		int len=ch.length;
		char []c=new char[len];
		int j=1,k=0;
		for(int i=0;i<ch.length;i++)
		{
		if(i%2==0)
				{
			
			c[j]=ch[i];
			j=j+2;
				}
			
		if(i%2!=0)
			{
					c[k]=ch[i];
					k=k+2;
		}
			
		}
	for(int i=0;i<c.length;i++)
		{
			System.out.print(" "+c[i]);
		}
	}

}
