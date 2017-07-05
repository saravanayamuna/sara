import java.util.Scanner;


public class vow {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		char []ch=str.toCharArray();
	for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				System.out.println(""+ch[i]);
			}
		}
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!='a'&&ch[i]!='e'&&ch[i]!='i'&&ch[i]!='o'&&ch[i]!='u')
			{
				System.out.println(""+ch[i]);
			}

		}
	}

}
