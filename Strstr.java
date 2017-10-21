import java.util.Scanner;


public class news {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		int n=input.nextInt();
		char [] ch=str.toCharArray();
		String s="";
		if(str.length()<n)
		{
			System.out.println(str);
		}
		else
		{
		for(int i=0;i<str.length();i++)
		{
			for(int j=i;j<str.length();j=j+n)
			{
				
				if(j>str.length())
				{
					break;
				}
				s=s+ch[j];
			}
		}
		}
		System.out.println(s.substring(0,str.length()));
	}

}
