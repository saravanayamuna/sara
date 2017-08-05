import java.util.Scanner;


public class Different {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int [][]arr=new int[num][num];
		int a=0;
		int b=0;
		int x=num;
		int y=num;
		int n=num;
		System.out.println(n);
		for(int c=0;c<num/2;c++)
		{
			for(int i=a;i<x;i++)
			{
				for(int j=a;j<x;j++)
				{
					if(i==a||j==a||i==x-1||j==x-1)
					{
						arr[i][j]=n;
					}
							
				}
			}
			a++;
			x--;
			n--;
	}
for(int i=0;i<num;i++)
{
	for(int j=0;j<num;j++)
	{
		System.out.print(arr[i][j]);
	}
	System.out.println();
}
}
}
