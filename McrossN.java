import java.util.Scanner;
public class Mcrossn {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int M=input.nextInt();
		System.out.println("Enter the number of coloumns");
		int N=input.nextInt();
		int [][] arr=new int[M][N];
		for(int i=0;i<M;i++)
		{
			for(int j=0;j<N;j++)
			{
				arr[i][j]=input.nextInt();
			}
		}
		int flag=0,sum=0,s=0;
		for(int i=0;i<M;i++)
		{
			for(int j=0;j<N;j++)
			{
				int a=i;
				int b=j;
				sum=0;
				s=0;
				for(int x=0;x<M;x++)
				{
					sum=sum+arr[a][x];
				}
				for(int y=0;y<N;y++)
				{
					s=s+arr[y][b];
				}
				if(sum==M&&s==N)
				{
					System.out.print(" "+"1");
				}
				else
				{
					System.out.print(" "+"0");
				}
			}
			System.out.println();
	}
	}
}
