import java.util.Scanner;


public class Strswap {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		String [] c=str.split(" ");
		for(int i=0;i<c.length;i++)
		{
			if(i%2==0)
			{
				StringBuffer sb=new StringBuffer(c[i]);
				c[i]=sb.reverse().toString();
			}
		}
		for(int i=0;i<c.length;i++)
		{
		System.out.print(" "+c[i]);
		}
	}

}
