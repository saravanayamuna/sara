import java.awt.List;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class Box {
	public static void main(String [] args)
	{
		
	Scanner input=new Scanner(System.in);
String text=input.nextLine();
int flag=0;
int num=text.length();
char[] ch = text.toCharArray();
    for (int i = 0; i < ch.length; i++) {
       // int randomIndex = (int)(Math.random() * characters.length);
    	Random ram=new Random();
    	int ra=ram.nextInt(ch.length);
        char temp = ch[i];
        ch[i] = ch[ra];
        ch[ra] = temp;
    }
    System.out.println(ch);
 int count=1;
for(int i=0;i<ch.length-1;i++)
{
	flag=1;
	if(ch[i]==ch[i+1])
	{
		flag=0;
	}

if(flag==1)
{
	count++;
}
}
if(count==num)
{
	System.out.println("valid");
}
else
{
	System.out.println("Invalid");
}
	}
}
