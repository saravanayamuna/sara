import java.util.Scanner;


public class array {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int []arr=new int[num];
		int flag;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=input.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			flag=1;
			for(int j=0;j<arr.length;j++)
			{
				if(i!=j)
				{
					if(arr[i]==arr[j])
					{
						flag=0;
					}
				}
			}
			if(flag==1)
			{
				System.out.print(""+arr[i]);
			}
		}
	}

}
