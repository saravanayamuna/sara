import java.util.Scanner;


public class mod {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int t,a,count=0,b=0,c,i=0;
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
			for(int k=j+1;k<arr.length;k++)
			{
				if(arr[j]>arr[k])
				{
					b=arr[j];
					arr[j]=arr[k];
					arr[k]=b;
				}
			}
			
		}
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(""+arr[j]);
		}
	}

}
