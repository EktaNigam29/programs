package Assisgnment.program;

public class overloading_methods_program {
	
	static void add(int a)
	{
		int sum=a+6;
		System.out.println(sum);
	}
	static void add(int a, double b)
	{
		double sum=a+b+6;
		System.out.println(sum);
	}
	
	void add(double a)
	{
		double sum=a+6;
		System.out.println(sum);
	}
	
	void add(int a, int b) {
		int sum=a+b+7;
		System.out.println(sum);
	}
	overloading_methods_program(int a)
	{
		System.out.println("int datatype");
	}
	overloading_methods_program(boolean b)
	{
		System.out.println("boolean datatype");
	}
	overloading_methods_program(char c)
	{
		System.out.println("character datatype");
	}
	
	
	
	
	
	public static void main(String[] args) {
		add(100);
		add(100,200.5);
		overloading_methods_program n1=new overloading_methods_program(true);
		new overloading_methods_program(11);
		new overloading_methods_program('A');
		n1.add(2.5);
		n1.add(300,400);

	
		
		
		
	}
}


