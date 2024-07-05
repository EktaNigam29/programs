package inhertance_java;
class Delhi
{
	static void add()
	{
		int a=200;
		int b=100;
		int sum=a+b;
		System.out.println(sum);
	}
}
class Chennai extends Delhi
{
	static void sub()
	{
		int a=200;
		int b=100;
		int sub=a-b;
		System.out.println(sub);
	}
}

public class Multilevel_inhertiance_static extends Chennai
{
	static void mul()
	{
	int a=20;
	int b=10;
	int multiply=a*b;
	System.out.println(multiply);
	}
	public static void main(String[] args) {
		
		add();
		sub();
		mul();
		
		
	}

}
