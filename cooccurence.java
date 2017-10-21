import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


public class cooccr {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		char ch[]=str.toCharArray();
		Set<Character> list=new LinkedHashSet<Character>();
		for(int i=0;i<ch.length;i++)
		{
			list.add(ch[i]);
		}
		Character [] ch1=list.toArray(new Character[list.size()]);
		String s="";
		String s1="";
		int count=0;
		for(int i=0;i<ch1.length;i++)
		{
			for(int j=0;j<ch1.length;j++)
			{
				s=""+ch1[i]+ch1[j];
				count=0;
				for(int k=0;k<str.length();k++)
				{
					if(k<str.length()-1)
					{
					s1=""+ch[k]+ch[k+1];
					if(s.equals(s1))
					{
						count++;
					}
				}}
				if(count>0)
				System.out.println(ch1[i]+"-"+ch1[j]+" "+count);
				
			}
		}
		
	}

}
