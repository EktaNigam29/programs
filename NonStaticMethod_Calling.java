package Assisgnment.program;

public class NonStaticMethod_Calling {
	
	
	
	void add()
	{
		int a=10;
		int b=30;
		int addition=a+b;
		System.out.println(addition);
	}

	void sub()
	{
		int a=50;
		int b=40;
		int subtraction=a-b;
		System.out.println(subtraction);
	}
	public static void main(String[] args) {
			
		NonStaticMethod_Calling n1=new NonStaticMethod_Calling();
		n1.add();
		n1.sub();
	
	
	}

}
