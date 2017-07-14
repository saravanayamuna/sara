import java.util.Scanner;


public class Average {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		int num1=input.nextInt();
		int [] array=new int[num1];
		int sum=0,count=0,c=0;
		int sum1=0;
		int n=num1/2;
		for(int i=0;i<array.length;i++)
		{
			array[i]=input.nextInt();
		}
		for(int i=0;i<=n;i++)
		{
			sum=sum+array[i];
			count++;
			}
		float a=(float)sum/count;
		for(int i=n+1;i<array.length;i++)
		{
			sum1=sum1+array[i];
			c++;
		}
		float b=(float)sum1/c;
		if(a==b)
		{
			System.out.print("first array is ");
			for(int i=0;i<=n;i++)
			{
				System.out.print(" "+array[i]);
			}
			System.out.println();
			System.out.print("second array is ");
			for(int i=n+1;i<array.length;i++)
			{
				
				System.out.print(" "+array[i]);
			}
		}
		else
		{
			System.out.println("not possible");
		}
		
	}

}
