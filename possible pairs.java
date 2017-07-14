import java.util.Scanner;


public class rotate {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the k value");
		int k=input.nextInt();
		System.out.println("Enter the number of element in an array");
		int str=input.nextInt();
		int [] array=new int[str];
		int count=0;
		int number1=0,number2=0;
		for(int i=0;i<str;i++)
		{
			array[i]=input.nextInt();
		}
		for(int j=0;j<str;j++)
		{
		for(int i=j+1;i<str;i++)
		{
			if(i!=j)
			{
		int x=array[j]-array[i];
		if(x<0)
		{
			x=(x)*(-1);
		}
		if(x==k)
			
			{
				count++;
				System.out.println("the pair is"+array[j]+"and"+array[i]);
			}
			}
		}}
		System.out.println("total number of pair is "+count);
	}

}
