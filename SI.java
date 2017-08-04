import java.util.Scanner;


public class SimpleInterest {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the principle amount");
		float amount=input.nextFloat();
		System.out.println("Enter the rate of the interest");
		float in=input.nextFloat();
		System.out.println("Enter the time of year");
		int year=input.nextInt();
		float f=(amount*in*year)/100;
		System.out.println(String.format("%.2f", f));
		
	}

}
