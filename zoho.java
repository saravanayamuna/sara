import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Zoho {
public static void main(String [] args)
{
	ArrayList<Integer> list=new ArrayList<Integer>();
	Scanner input=new Scanner(System.in);
	int num=input.nextInt();
	int [] arr=new int[num];
	int [] c=new int[num];
	int max=0,min=0,k=0,j=1;
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=input.nextInt();
		list.add(arr[i]);
		}
	Collections.sort(list);
	Collections.reverse(list);
	Integer [] copy=list.toArray(new Integer[list.size()]);
	int n=copy.length;
	int n1=n/2;
	if(n%2==0)
	{
	for(int i=0;i<copy.length/2;i++,k=k+2)
	{
		c[k]=copy[i];	
	}
	for(int i=n-1;i>=n1;i--,j=j+2)
	{
		c[j]=copy[i];
	}
	for(int i=0;i<copy.length;i++)
	{
		System.out.print(" "+c[i]);
	}
	}
	if(n%2!=0)
	{
	for(int i=0;i<n1+1;i++,k=k+2)
	{
		c[k]=copy[i];	
	}
	for(int i=n-1;i>n1;i--,j=j+2)
	{
		c[j]=copy[i];
	}
	for(int i=0;i<copy.length;i++)
	{
		System.out.print(" "+c[i]);
	}
	}
}
}
