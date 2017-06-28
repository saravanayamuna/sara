import java.util.Scanner;


public class rep {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		String out=input.next();
		StringBuffer str=new StringBuffer(out);
	int l=str.length()-1;
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				if(i!=j)
				{
				if(str.charAt(i)==str.charAt(j))
				{
					//System.out.println(str);
					str.deleteCharAt(j);
					//l--;
				}
				}
				
			}
		
		}	//System.out.println(out.length()+" "+str.length());
System.out.println(""+str);
	

}
}
