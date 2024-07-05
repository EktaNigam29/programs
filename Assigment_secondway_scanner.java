package area_for_Scanner;

import java.util.Scanner;

public class Assigment_secondway_scanner {

	public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter two values a and b");
	int a=s1.nextInt();
	int b=s1.nextInt();
	int sum=a+b;
	System.out.println("The addition of a and b " +sum);

	System.out.println("Enter two values c and d");
	int c=s1.nextInt();
	int d=s1.nextInt();
	int sub=c-d;
	System.out.println("The subtraction of c and d " +sub);
	
	System.out.println("Enter two values e and f");
	int e=s1.nextInt();
	int f=s1.nextInt();
	int div=e/f;
	System.out.println("The divison of c and d " +div);
	
	System.out.println("Enter two values g and h");
	int g=s1.nextInt();
	int h=s1.nextInt();
	int mul=g*h;
	System.out.println("The divison of g and h " +mul);
	
	System.out.println("Enter two values i and j");
	int i=s1.nextInt();
	int j=s1.nextInt();
	int modolo=i/j;
	System.out.println("The modolous of i and j " +modolo);
	
	

	}

}
