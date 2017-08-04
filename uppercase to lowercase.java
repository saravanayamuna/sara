import java.util.Scanner;


public class Upper {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		char []ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isUpperCase(ch[i]))
			{
				System.out.print(Character.toLowerCase(ch[i]));
			}
			if(Character.isLowerCase(ch[i]))
			{
				System.out.print(Character.toUpperCase(ch[i]));
			}
		}
	}

}
