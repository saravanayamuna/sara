import java.util.Scanner;
import java.util.TreeSet;
public class Toggle {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		String [] arr=new String[2];
		String str="";
		String str1="";
		int max=0,min=1234578;
		System.out.println("Enter the String");
		for(int i=0;i<2;i++)
		{
	       arr[i]=input.next();
			if(arr[i].length()>max)
			{
				max=arr[i].length();
				str=arr[i];
			}
			if(arr[i].length()<min)
			{
				min=arr[i].length();
				str1=arr[i];
			}
		}
		if(str.length()==(str1.length()))
		{
			TreeSet<String> list=new TreeSet<String>();
			for(int i=0;i<2;i++)
			{
				list.add(arr[i]);
			}
		String [] sum=list.toArray(new String[list.size()]);
		str1=sum[0];
		str=sum[1];
		}
		System.out.println("Enter the Pin");
		int pin=input.nextInt();
		System.out.println("Enter the n");
		int N=input.nextInt();
       String st=Integer.toString(pin);
		char [] ch=st.toCharArray();
		int [] t1=new int[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			t1[i]=(int)ch[i]-48;
		}
		String s=str.charAt(0)+str1+t1[N-1]+t1[ch.length-N];
		char [] ch1=s.toCharArray();
		for(int i=0;i<ch1.length;i++)
		{
			if(Character.isLowerCase(ch1[i]))
			{
				ch1[i]=Character.toUpperCase(ch1[i]);
			}
			else if(Character.isUpperCase(ch1[i]))
			{
				ch1[i]=Character.toLowerCase(ch1[i]);
			}
		}
	for(int i=0;i<ch1.length;i++)
	{
		System.out.print(ch1[i]);
	}
}

}
