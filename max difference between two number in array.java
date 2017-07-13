import java.util.Scanner;


public class Differ {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int num=input.nextInt();
		int max=0, num1=0, num2=0;
		int [] array=new int[num];
		for(int i=0;i<num;i++)
		{
			array[i]=input.nextInt();
		}
		for(int i=0;i<num-1;i++)
		{
			int answer=array[i]-array[i+1];
			if(answer<0)
			{
				answer=(answer)*(-1);
			}
			if(answer>max)
			{
				max=answer;
				 num1=array[i];
				num2=array[i+1];
			}
		}
		System.out.println(max+" is the maximum difference between "+num1+" and "+num2);
	}

}
