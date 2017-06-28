import java.util.Scanner;


public class rev {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		StringBuffer sb=new StringBuffer(str);
	
	String s=sb.reverse().toString();
		char []ch=s.toCharArray();
	String st="";
	for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				
			continue;
			}
			else
			{
				st=st+ch[i];
			}
		}
	System.out.println(""+st);
	}

}
