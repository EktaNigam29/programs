package Assisgnment.program;

public class staticmethod_overloading {
	static void add(int a)
	{
		int sum=a+6;
		System.out.println(sum);
	}
	static void add(int a, int b)
	{
		int sum=a+b+6;
		System.out.println(sum);
	}
	static void add(double a)
	{
		double sum=a+6;
		System.out.println(sum);
	}
	static void add(double a,double b,int c)
	{
		double sum=a+b+c+6;
		System.out.println(sum);
	}


	public static void main(String[] args) {
		
add(100);
add(100,200);
add(2.5);
add(1.5,2.5,7);
	}

}
