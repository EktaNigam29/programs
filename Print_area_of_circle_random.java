//WAP on area of circle using math.random five times using for loop
package area_for_Scanner;

public class Print_area_of_circle_random {

	static double pi_value=Math.PI;
	
	public static void main(String[] args) {
		
for(int i=1;i<=5;i++)
{
	double r=Math.random();
	double area= pi_value*r*r;
	
	System.out.println("Area of circle " +area);
	}
}
	}


