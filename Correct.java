import java.util.Scanner;


public class machi {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		char [] ch=str.toCharArray();
		int count=0;
	    int k=0,s=0;
		for(int i=0;i<str.length();)
		{
			count=0;
			k=i;
			for(int j=i;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					i++;
				}
				if(i>str.length()-1)
				{
					break;
				}
				if(ch[i]!=ch[j])
				{
					
					break;
				}
			}
			System.out.println(ch[k]+" "+count);
		}
	}

}
