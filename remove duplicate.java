import java.util.Arrays;
import java.util.Scanner;


public class with {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		char []ch=str.toCharArray();
		int len=ch.length-1;
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
					if(ch[i]==ch[j]&&i!=j)
					{
	for(int m=j;m<len;m++)
	
						ch[m]=ch[m+1];
						len--;
						}
					}
				}
			
		
		for(int i=0;i<len;i++)
		{
			System.out.print(""+ch[i]);
		}
	}

}
