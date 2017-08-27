import java.util.Scanner;
class romoveS {
	 public void getString(String str)
	 {
		 char ch[]=str.toCharArray();
		 String s="";
		 for(int i=0;i<ch.length;i++)
		 {
				 if(!(s.contains(ch[i]+"")))
				 {
					 s=s+ch[i];
				 }
			 }
		 System.out.println(s);
		 }
	public static void main(String [] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		romoveS s=new romoveS();
		s.getString(str);
		
	}
}