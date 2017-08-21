package java_8_training;

import java.util.ArrayList;
import java.util.Scanner;

public class guvi {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		Integer [] one=new Integer[num];
		ArrayList<Integer> list=new ArrayList<Integer>();
		ArrayList<Integer> pos=new ArrayList<Integer>();
		for(int i=0;i<num;i++)
		{
			one[i]=input.nextInt();
			list.add(one[i]);
		}
		while(list.size()>1)
		{
			for(int i=0;i<list.size();i++)
			{
				if(i%2!=0)
				{
					pos.add(list.get(i));
				}
			}
			list.clear();
			list.addAll(pos);
			pos.clear();
		
		}
		int n=list.get(0);
		for(int i=0;i<num;i++)
		{
			if(n==one[i])
			{
				System.out.println(i+1);
			}
		}
	}

}
