import java.util.Scanner;


public class mod {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int t,a,count=0,b=0,c,i=0,sum=0;
		int copy=num;
		while(num>0)
		{
			t=num%10;
			count++;
			num=num/10;
		}
		int [] arr=new int[count];
		while(copy>0)
		{
			a=copy%10;
			arr[i]=a;
			copy=copy/10;
			i++;
		}
		for(int j=0;j<arr.length;j++)
		{
			if(j%2==0)
			{
				sum=sum+arr[j];
			}
			
		}
		System.out.println("sum of even position is "+sum);
	}

}
