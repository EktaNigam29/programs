package strings_assisgnment;

public class Type_casting_118_119 {

	public static void main(String[] args) {
		// int into double
		
		double a1=100;
		System.out.println(a1);//widening implicity//it happens implicity
		
		double a2=(double) 100;
		System.out.println(a1);//widening explicity
		
		// int into double
		int a4=(int) 64.50;
		System.out.println(a4);//narrowing happens explicitly
		
		double wt=76.54;
		int a5=(int) wt;
		System.out.println(a5);

	}

}
