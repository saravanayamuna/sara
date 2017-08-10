import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.*;
public class Linked {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		Set<Character> list=new LinkedHashSet<Character>();
		String str=input.nextLine();
		char [] ch=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			list.add(ch[i]);
		}
		Character [] ch1=list.toArray(new Character[list.size()]);
		for(int i=ch1.length-1;i>=0;i--)
		{
		System.out.print(ch1[i]);	
		}
		
	}

}
