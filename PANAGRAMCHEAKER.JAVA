import java.util.Scanner;
import java.util.TreeSet;


public class panagramCheaker
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		TreeSet<Character> list = new TreeSet<Character>();
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)!=' ') {
				list.add(str.charAt(i));
			}
		}
		if(list.size()==26)
			System.out.println("it is an Panagram");
		else
			System.out.println("It is not an Panagram");
	}


}

