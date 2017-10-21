import java.util.Arrays;
import java.util.Scanner;


public class un {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=a;
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("#");
			}
			b--;
			System.out.println();
		}
}}
