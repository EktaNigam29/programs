package basics.programm;

import java.util.Scanner;

public class Second_practice_program {
	
static Scanner s1=new Scanner(System.in);
static double pi_value=Math.PI;

/*void add()
{
	int l=s1.nextInt();
	int b=s1.nextInt();
	int sum=2*(l+b);
	System.out.println("Area of rectangle " +sum);
}*/
/*static void sub()
{
	int a=s1.nextInt();
	int b=s1.nextInt();
	int sub=a-b;
	System.out.println("Subtraction " +sub);	
}*/


	public static void main(String[] args) {
		double r=s1.nextDouble();
		double c=2*pi_value*r;
		System.out.println("Circumfernce of circle " +c);
		
		

}
}
