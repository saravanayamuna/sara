import java.util.Scanner;
import java.util.TreeSet;


public class First {
	
public static void main(String [] args)
{
	Scanner input=new Scanner(System.in);
	String str=input.nextLine();
String answer="";
int max=0;
	for(int i=0;i<=str.length();i++)
	{
		for(int j=i+1;j<=str.length();j++)
		{
				
			String sum=str.substring(i, j);
			int len=sum.length();
          int copy=sum.length();
		for(int y=0;y<sum.length();y++)
		{
			for(int z=y+1;z<sum.length();z++)
			{
				if(i!=j)
				{
				if(sum.charAt(y)==sum.charAt(z))
				{
					copy--;
					
				}}}}
			if(len==copy)
			{
				int large=sum.length();
				if(large>max)
				{
					max=large;
					 answer=sum;
				}}}}
	System.out.println(answer);
}
}
