import java.util.Scanner;



	public class zero {

		public static void main(String[] args) {
			int num;
			int sum=0;
			int a=0;
			Scanner in=new Scanner(System.in);
			num=in.nextInt();
			while(num!=0)
			{	
			     int b=a;
			     a=num%10;
				sum=sum+(int)Math.pow(a,b);
				num=num/10;
			}
			System.out.println(sum);

	}


}
