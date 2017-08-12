import java.util.LinkedList;
import java.util.Scanner;


public class list {
	public static void main(String [] args)
	{
		LinkedList<Integer> num=new LinkedList<Integer>();
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		for(int i=0;i<n;i++)
		{
			num.add(input.nextInt());
		}
		if(n%2!=0)
		{
			System.out.println(num.get(n/2));
		}
		else if(n%2==0)
		{
			System.out.println(n/2+1);
		}
	}

}
