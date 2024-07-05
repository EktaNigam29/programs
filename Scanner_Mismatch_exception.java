package area_for_Scanner;

import java.util.Scanner;

public class Scanner_Mismatch_exception {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		String name=s1.next();
		byte a= s1.nextByte();
		short b= s1.nextShort();
		long c=s1.nextLong();
		int d=s1.nextInt();
		boolean e=s1.nextBoolean();
		float f=s1.nextFloat();
		double g= s1.nextDouble();
		

	}

}
