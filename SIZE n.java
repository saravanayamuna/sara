import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class SNAKE {
public static void main(String[] args)
	{
	  int n, temp;
      Scanner input = new Scanner(System.in);
       n = input.nextInt();
      int arr[] = new int[n];
      System.out.println("Enter all the elements:");
      List<Integer> list=new ArrayList<Integer>();
      for (int i = 0; i < n; i++) 
      {
          arr[i] = input.nextInt();
          list.add(arr[i]);
      }
      Collections.sort(list);
      Collections.reverse(list);
      Integer [] b=list.toArray(new Integer[list.size()]);
      for (int i = 0; i < n - 1; i++) 
      {
          System.out.print(b[i] + ",");
      }
      
	   } 

	}



