package area_for_Scanner;

import java.util.Scanner;



public class Scanner_nonstatic {
static Scanner s1=new Scanner(System.in);


void add()
{
	int a=s1.nextInt();
	int b=s1.nextInt();
	int c=s1.nextInt();
	int d=s1.nextInt();
	
	int sum=a+b+c+d;
	System.out.println("The addition of a,b,c and d " +sum);
}
void sub()
{
	int a=s1.nextInt();
	int b=s1.nextInt();
	int sub=a-b;
	System.out.println("The subtraction of a and b " +sub);
}
void mul()
{
	int a=s1.nextInt();
	int b=s1.nextInt();
	int mul=a*b;
	System.out.println("The multiplication of a and b " +mul);
}
void div()
{
	int a=s1.nextInt();
	int b=s1.nextInt();
	int div=a/b;
	System.out.println("The divison of a and b " +div);
}
void mod()
{
	int a=s1.nextInt();
	int b=s1.nextInt();
	int mod=a%b;
	System.out.println("The modolus of a and b " +mod);
}
public static void main(String[] args) {
		
		Scanner_nonstatic n1=new Scanner_nonstatic();
		n1.add();
		n1.sub();
		n1.mul();
		n1.div();
		n1.mod();
	}

}
