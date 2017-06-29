import java.util.Scanner;


public class him {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int sum=0,a,b,c=1,count=0,ans;
		int []g=new int[5];
		while(num>0)
		{
			a=num%10;
			sum=(sum*10)+a;
			num=num/10;
		}
	int	i=0;
		while(sum>0)
		{
			b=sum%10;
			c=0;
    ans= (int) Math.pow(b,i);
    count=count+ans;

      i++;
			sum=sum/10;
			
			
		}
		System.out.println(""+count);
		
	}

}
