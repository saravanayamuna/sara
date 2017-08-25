import java.util.Arrays;
import java.util.Scanner;


public class Big {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number of Elephant");
		int N=input.nextInt();
		System.out.println("Enter Maximum weight weight of spider web support");
		int W=input.nextInt();
		int [] arr=new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=input.nextInt();
		}
		Arrays.sort(arr);
		int sum=0,count=0;;
		for(int i=0;i<N;i++)
		{
			if(sum<=W&&sum+arr[i]<=W)
			{
				sum=sum+arr[i];
				count++;
			}}
		System.out.println(count);
	}}
