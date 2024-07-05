//WAP using finally block in try catch

package abstractclassprograms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ass64_finally {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		try{System.out.println("Enter age");
		int age=s1.nextInt();
	System.out.println(age);
	System.out.println("Enter salry");
	Scanner s3= new Scanner(System.in);
	double salary=s3.nextDouble();
	System.out.println(salary);
	System.out.println("Enter weight");
	Scanner s5= new Scanner(System.in);
	float weight=s5.nextFloat();
	System.out.println(weight);
	System.out.println("Are you a student");
	Scanner s7= new Scanner(System.in);
	boolean student=s7.nextBoolean();
	System.out.println(student);
	}
		
	catch(InputMismatchException a1)
	{
		System.out.println("Enter numeric value");
		Scanner s2= new Scanner(System.in);
		int age1=s2.nextInt();
		System.out.println(age1);
		System.out.println("Enter salary");
		Scanner s4= new Scanner(System.in);
		double salary1=s4.nextDouble();
		System.out.println(salary1);
		System.out.println("Enter numeric weight");
		Scanner s6= new Scanner(System.in);
		float weight1=s6.nextFloat();
		System.out.println(weight1);
		System.out.println("Are you a student info");
		Scanner s8= new Scanner(System.in);
		boolean student1=s8.nextBoolean();
		System.out.println(student1);
		
	}
	finally
	
	{
		System.out.println("Enter your name");
	Scanner s9= new Scanner(System.in);
	String name=s9.next();
	}


	}

}
