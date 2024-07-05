package inhertance_java;
class ChildClass{
	void add()
	{
		int a=400;
		int b=500;
		int sum=a+b;
		System.out.println(sum);
	}
}

public class Singlelevel_inhertiance_nonstatic extends ChildClass
{

	void sub()
	{
		int a=400;
		int b=300;
		int subtraction=a-b;
		System.out.println( subtraction);
	}
	public static void main(String[] args) {
		Singlelevel_inhertiance_nonstatic n1=new Singlelevel_inhertiance_nonstatic();
		n1.add();
		n1.sub();

	}

}
