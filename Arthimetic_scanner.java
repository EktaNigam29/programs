package area_for_Scanner;

import java.util.Scanner;

public class Arthimetic_scanner {
static Scanner s1=new Scanner(System.in);


static void  add()
{
	System.out.println("Enter the value of a and b");
	int a=s1.nextInt();
	int b=s1.nextInt();
	int sum= a+b;
	System.out.println("The addition of a and b " +sum);
}
static void  sub()
{
	System.out.println("Enter the value of a and b");
	int a=s1.nextInt();
	int b=s1.nextInt();
	int subtraction= a-b;
	System.out.println("The subtraction of a and b " +subtraction);
}

static void  mul()
{
	System.out.println("Enter the value of a and b");
	int a=s1.nextInt();
	int b=s1.nextInt();
	int multiply= a*b;
	System.out.println("The multiplication of a and b " +multiply);
}

static void  div()
{
	System.out.println("Enter the value of a and b");
	int a=s1.nextInt();
	int b=s1.nextInt();
	int division= a/b;
	System.out.println("The div of a and b " +division);
}

static void  mod()
{
	System.out.println("Enter the value of a and b");
	int a=s1.nextInt();
	int b=s1.nextInt();
	int modolo= a%b;
	System.out.println("The modolus of a and b " +modolo);
}


	public static void main(String[] args) {
		
add();
sub();
mul();
div();
mod();


	}

}
