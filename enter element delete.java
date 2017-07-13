import java.util.Scanner;


public class remove {
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of the elements in the array");
		int num=input.nextInt();
	   int [] array=new int[num];
       System.out.println("enter the elements");
       for(int i=0;i<num;i++)
       {
	   array[i]=input.nextInt();
       }
      System.out.println("Enter the elements wants to remove");
     int number=input.nextInt();
      for(int i=0;i<array.length;i++)
      {
	if(array[i]==number)
	{
		array[i]=' ';
	}
}
      System.out.println("new array is an");
      for(int i=0;i<array.length;i++)
      {
    	  if(array[i]!=' ')
    	  {
    		  System.out.print(" "+array[i]);
    	  }
      }
	}

}
