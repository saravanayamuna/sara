import java.util.Scanner;


public class TwoWords {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		String [] s=str.split(" ");
		String [] str1=new String[s.length+1];
		int j=0;
		int num=s.length-1;
		for(int i=num;i>=0;i--,j++)
		{
			str1[j]=s[i];
		}
		for(int i=0;i<str1.length-1;i++)
		{
			System.out.print(" "+str1[i]);
		}
	}

}
