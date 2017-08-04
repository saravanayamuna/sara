import java.util.Scanner;


public class spiral {
public static void main(String [] args)
{
	Scanner input=new Scanner(System.in);
	int R=input.nextInt();
	int C=input.nextInt();
	int [][]arr=new int[R][C];
	for(int i=0;i<R;i++)
	{
		for(int j=0;j<C;j++)
		{
			arr[i][j]=input.nextInt();
		}
	}
	int a=0,b=0;
	while(a<R&&b<C)
	{
for(int i=b;i<C;i++)
{
	System.out.print(" "+arr[a][i]);
}
a++;
for(int i=a;i<R;i++)
{
	System.out.print(" "+arr[i][C-1]);
}
C--;
if(a<R)
{
for(int i=C-1;i>=b;i--)
{
	System.out.print(" "+arr[R-1][i]);
}
R--;
}
if(b<C)
{
for (int i = R-1; i >= a; --i)
{
    System.out.print(" "+ arr[i][b]);
}
b++;
}
	}
}
}
