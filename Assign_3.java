package revision_daily;
import java.util.Scanner;


public class Assign_3 {
	
	static Scanner s1=new Scanner(System.in);
	static int a=s1.nextInt();
	static int b=s1.nextInt();
	static int c=s1.nextInt();

	public static void main(String[] args) {
		
		switch(c)
		{

		case 1:
			int sum=a+b;
			System.out.println("addition " +sum);
			break;
			
		case 2:
			int sub=a-b;
			System.out.println("subtraction " +sub);
			break;
		case 3:
			int div=a/b;
			System.out.println("div " +div);
			break;
			
		case 4:
			int mod=a%b;
			System.out.println("mod " +mod);
			break;
			
			default:
				System.out.println("no operator");



		}
			
			
			
			
	}

}
