import java.util.Scanner;


public class pat {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int copy=num;
		for(int i=1;i<=num;i++)
		{
			for(int a=1;a<copy;a++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(""+j);
			}
			for(int k=i-1;k>=1;k--)
			{
				System.out.print(""+k);
			}
			System.out.println();
		
		copy--;
		}
	}

}
