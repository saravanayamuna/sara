import java.util.Scanner;


public class AddSep {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int copy=num;
		int rem=0,ans=0,r;
		while(num>0)
		{
			rem=num%10;
			ans++;
			num=num/10;
		}
		int []arr=new int[ans];
		int []array=new int[ans];
		int k=0;
		while(copy>0)
		{
		r=copy%10;
			arr[k]=r;
			k++;
			copy=copy/10;
		}
		int j=0;
		for(int i=ans-1;i>=0;i--,j++)
		{
			array[j]=arr[i];
		}
		int mul=0;
		for(int i=0;i<ans;i++)
		{
			if(i!=ans-1)
			{
			mul=mul+(int) Math.pow(array[i],array[i+1]);
			}
			if(i==ans-1)
			{
			mul=mul+(int)Math.pow(array[i],array[0]);
			}
		}
		System.out.println(""+mul);
	}

}
