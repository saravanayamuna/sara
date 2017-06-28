import java.util.Scanner;


public class hun {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		int y=input.nextInt();
		int copy=x;
		int a,b,c;
		while(x>0)
		{
			a=x%10;
			copy=copy*a;
			x=x/10;
		}
		if(copy==y)
		{
		System.out.println("x is an seed of y");
		}
		else
		{
			System.out.println(" x not seed of y");
		}
	}

}
