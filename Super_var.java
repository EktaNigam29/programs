package practise;
//super for variable and method
class A
{
	String colour="red";
	void login()
	{
		System.out.println("Hi");
	}
	
	
}

public class Super_var extends A{
	
	String colour="blue";
	void login()
	{
		System.out.println("Hello");
		super.login();
		System.out.println(super.colour);
	}
	
	

	public static void main(String[] args) {
	
		Super_var s1=new Super_var();
		System.out.println(s1.colour);
		s1.login();
	}

}
