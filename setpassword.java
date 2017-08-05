import java.util.Scanner;


public class password {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		String input1=input.next();
		int input2=input.nextInt();
		int sum=0;
         int cu=input2;
		int copy=input2;
		char a1 = 0;
		while(copy>10)
		{
			sum=0;
			input2=copy;
		while(input2>0)
		{
			int in=input2%10;
			sum=sum+in;
			input2=input2/10;
		}
		copy=sum;
		}
		char c=input1.charAt(input1.length()-1);
		char a=input1.charAt(0);
		if(Character.isLowerCase(a))
			 a1=Character.toUpperCase(a);
		if(Character.isUpperCase(a))
			 a1=Character.toLowerCase(a);
		while(cu>=10)
		{
			cu=cu/10;
		}
String str="";
str=str+cu+a1+sum+c;
System.out.println(str);
	}

}
