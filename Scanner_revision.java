package basics.programm;

import java.util.Scanner;

public class Scanner_revision {
	static Scanner s1=new Scanner(System.in);
 

	public static void main(String[] args) {
		
		System.out.println("enter length and breadth  of rectangle");
		int l= s1.nextInt();
		int b= s1.nextInt();
		
		int area=2*(l+b);
		System.out.println("Area of rectangle " +area);
		
		


	}

}
