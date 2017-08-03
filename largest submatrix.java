import java.util.Scanner;

public class One {
	public static void main(String [] args)
	{
	
		Scanner input=new Scanner(System.in);
		int r=input.nextInt();
		int c=input.nextInt();
		int [][] arr=new  int[r][c];
		int [][] main=new int[3][3];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=input.nextInt();
			}
		}
		int sum=0,count=0,a=0,b=0,a1=0,b1=0,m,k = 0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				sum=0;
				if(i<r-2&&j<c-2)
				{
				for( m=i;m<i+3;m++)
				{
				for(k=j;k<j+3;k++)
				{
					
					sum=sum+arr[m][k];
				}
				}
					if(sum>count)
					{
						count=sum;
						a=i;
						b=j;
						a1=m;
						b1=k;
					}}}}
		for(int i=a;i<a1;i++)
		{
			for(int j=b;j<b1;j++)
			{
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
	}
	}


