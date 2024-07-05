package area_for_Scanner;

import java.util.Scanner;

public class Circumfernce_Scanner {
static Scanner s1=new Scanner(System.in);
static double pi_value= Math.PI; 

static void circum()
{
	System.out.println("Enter radius of circle");
	double r= s1.nextDouble();
	double circumfernce=2*pi_value*r;
	System.out.println("Circumfernce of circle " +circumfernce);
	
}
	public static void main(String[] args) {
		
		circum();
	}

}
