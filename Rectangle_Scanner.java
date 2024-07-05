package area_for_Scanner;

import java.util.Scanner;

public class Rectangle_Scanner {
static Scanner s1=new Scanner(System.in);

static void area()
{
	System.out.println("Enter values l and b");
	int l=s1.nextInt();
	int b=s1.nextInt();
	int area=2*(l+b);
	System.out.println("The area of rectangle " +area);
	
}
	public static void main(String[] args) {
		area();

	}

}
