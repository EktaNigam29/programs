package Assisgnment.program;

public class nonstaticmethod_overloading {
	
	
	
	void add(double a)
	{
		double sum=a+6;
		System.out.println(sum);
	}
	void add(int a)
	{
		int sum=a+6;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		nonstaticmethod_overloading n1=new nonstaticmethod_overloading();
		n1.add(3.5);
		n1.add(15);
	}

}
