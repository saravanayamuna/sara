import java.util.Scanner;


public class sumpalind {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int sum=0;
		while(num>0)
		{
			int n=num%10;
			sum=sum+n;
			num=num/10;
		}
		String s=Integer.toString(sum);
		String copy=s;
		StringBuffer sb=new StringBuffer(s);
		String str=sb.reverse().toString();
		if(copy.equals(str))
		{
			System.out.println("It is Palindrome number");
		}
		else
		{
			System.out.println("It is not Palindrome number");
		}
	}

}
