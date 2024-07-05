package inhertance_java;
class ParentClass
{
	static void add()
	{
		int a=40;
		int b=50;
		int sum=a+b;
		System.out.println(sum);
	}
}

public class Singlelevel_inhertiance_static extends ParentClass
{
static void sub()
{
	int a=50;
	int b=40;
	int subtraction=a-b;
	System.out.println(subtraction);
}
	public static void main(String[] args) {
		add();
		sub();
	}

}
