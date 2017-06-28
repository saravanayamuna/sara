import java.util.Arrays;
import java.util.Scanner;


public class kim {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		char []ch=str.toCharArray();
		char c = 0;
	//Arrays.sort(ch);
		int count=0,num=0;
		for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch.length-1;j++)
			{
				if(i!=j)
				{
					if(ch[i]==ch[j])
				{
					count++;
				}
					
				
				}
			}
			if(count>num)
			{
				num=count;
				c=ch[i];
				
			}
		}
			System.out.println("count is "+count+" and character is "+c);
		}
	

}
