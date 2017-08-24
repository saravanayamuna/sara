import java.util.Scanner;


public class En {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		String str1=input.nextLine();
		String str2=input.nextLine();
		char [] al={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char [] ch1=str1.toCharArray();
		char [] ch2=str2.toCharArray();
		for(int i=0;i<ch1.length;i++)
		{
			for(int j=0;j<al.length;j++)
			{
				if(ch1[i]==al[j]&&j<=16)
				{
					char c= (char) ((char)al[j]+10);
					System.out.print(c);
				}
				if(ch1[i]==al[j]&&j>16)
				{
					int a=Math.abs(j-25);
					int b=Math.abs(a-10);;
					System.out.print(al[b-1]);
				}
			}
		}
		System.out.println();
		System.out.print(ch2[0]);
		for(int i=1;i<ch2.length-1;i++)
		{
			for(int j=0;j<al.length;j++)
			{
				if(ch2[i]==al[j]&&j<=16)
				{
					char c= (char) ((char)al[j]+10);
					System.out.print(c);
				}
				if(ch2[i]==al[j]&&j>16)
				{
					int a=Math.abs(j-25);
					int b=Math.abs(a-10);;
					System.out.print(al[b-1]);
				}
			}
		}
		System.out.println(ch2[ch2.length-1]);
	}}
