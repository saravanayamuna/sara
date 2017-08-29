import java.util.Scanner;


public class Fun {
	public void getString(String s)
	{
		String [] arr=s.split(" ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		Fun F=new Fun();
		F.getString(str);
	}

}
