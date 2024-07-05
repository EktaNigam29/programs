package method.overriding;

class Parent
{
	void login()
	{
		System.out.println("Login phone number");
	}

	
}

public class Method_Overriding extends Parent

{
	void login()
	{
	System.out.println("Login email Id");
	}

	public static void main(String[] args) {
		Method_Overriding m1=new Method_Overriding();
		m1.login();

	}

}
