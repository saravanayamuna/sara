import java.util.Scanner;


public class dia {
	public static void main(String [] args)
	{
		
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		char []ch=str.toCharArray();
		int num=ch.length-1;
		for(int i=0;i<num;i++)
		{
			for(int j=num;j>=i;j--)
			{
				System.out.print(ch[j]);
			}
			for(int a=0;a<i*2;a++)
			{
				System.out.print(" ");
			}
			for(int b=i;b<=num;b++)
			{
				System.out.print(""+ch[b]);
			}
			System.out.println();
		}
		int sum=8;
		for(int i=0;i<=num;i++)
		{
			for(int c=num;c>=num-i;c--)
			{
				System.out.print(ch[c]);
			}
			for(int a=1;a<=sum;a++)
			{
				System.out.print(" ");
			}
			for(int b=num-i;b<=num;b++)
			{
				System.out.print(ch[b]);
			}
			sum=sum-2;
			System.out.println();
		}
	}

}
