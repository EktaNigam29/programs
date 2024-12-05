package practise;

public class MethodCascading {
	void display()
	{
		System.out.println("Hi");
	}
	void test()
	{
		System.out.println("Hello");
	}
	void show()
	{
		display();
		test();
	}
	public static void main(String[] args) {
		
		MethodCascading m1=new MethodCascading();
		m1.show();
	}

}
