import java.util.Scanner;


public class word {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		String [] arr=str.split(" ");
		int len=arr.length;
		String s="";
		for(int i=len-1;i>=0;i--)
		{
			char []ch=arr[i].toCharArray();
			s="";
			for(int j=0;j<ch.length;j++)
			{
				if(Character.isUpperCase(ch[j]))
				{
					s=s+Character.toLowerCase(ch[j]);
				}
				if(Character.isLowerCase(ch[j]))
				{
					s=s+Character.toUpperCase(ch[j]);
				}
			}
				System.out.print(s+" ");
			
		}
	}

}
