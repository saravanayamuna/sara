import java.util.Scanner;
public class Eng {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		int flag=0;
	for(int i=0;i<str.length();i++)
		{
		flag=1;
		for(int j=0;j<str.length();j++)
		{
			if(str.charAt(i)==str.charAt(j)&&i!=j)
			{
				flag=0;
			}
			}
		if(flag==1)
		{
			System.out.println(str.charAt(i));
		}}
		}}
