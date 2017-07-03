import java.util.Scanner;


public class AddSep {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int rem=0;
		
		while(num>0)
		{
			int n=num%10;
			 rem=rem+(n*n*n*n);
			num=num/10;
		}
		
		System.out.println(""+rem);
	}

}
