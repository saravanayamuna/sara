import java.util.Scanner;


public class bsb {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int N=input.nextInt();
		int [] arr=new int[N+1];
		System.out.println("Enter array elemnents");
		for(int i=0;i<N;i++)
		{
			arr[i]=input.nextInt();
		}
		System.out.println("Enter the number to be inserted ");
		int num=input.nextInt();
		System.out.println("Enter the postion");
		int pos=input.nextInt();
		for(int i=N-1;i>=pos-1;i--)
		{
			
			arr[i+1]=arr[i];
		
			
		}
		arr[pos-1]=num;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
	}

}
