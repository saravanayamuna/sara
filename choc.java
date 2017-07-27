import java.util.Scanner;


public class Rectangle {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		int M=input.nextInt();
		int [][] two=new int[M][2];
		int []one=new int[M];
		for(int i=0;i<M;i++)
		{
			for(int j=0;j<2;j++)
			{
				two[i][j]=input.nextInt();
			}
		}
		for(int i=0;i<M;i++)
		{
			one[i]=1;
			for(int j=0;j<2;j++)
			{
				one[i]=two[i][j]*one[i];
			}
		}
		for(int i=0;i<one.length;i++)
		{
			System.out.println(one[i]-1+" ");
		}
	}

}
