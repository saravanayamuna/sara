import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Brief {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.next();
		char [] ch=str.toCharArray();
		ArrayList<Integer> list=new ArrayList<Integer>();
		ArrayList<Integer> st=new ArrayList<Integer>();
		ArrayList<Character> chr=new ArrayList<Character>();
		int [] in=new int[ch.length];
		int j=0;
		int number=0;
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isAlphabetic(ch[i]))
			{
				chr.add(ch[i]);
			}
		}
		Character [] sun=chr.toArray(new Character[chr.size()]);
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isDigit(ch[i]))
			{
		in[j]=in[j]*10+((int)ch[i]-48);
		list.add(in[j]);
			}
			else
			{
j++;
}}
		for(int i=0;i<in.length;i++)
		{
			if(in[i]!=0)
			{
			st.add(in[i]);
			
			}
		}
	Integer [] a=st.toArray(new Integer[st.size()]);
	for(int c=0;c<sun.length;c++)
	{
	for(int i=0;i<a[c];i++)
	{
		System.out.print(" "+sun[c]);
	}
	}}}
