package method.overriding;

class Method
{
	void login(int a)
	{
		System.out.println("Login Phone Number");
	}
}


public class Super_keyword_overriding_parameter extends Method


{ void login(int a, double b)
	{super.login(10);
	System.out.println("Login Email Id");
	//super.login();
	}

	public static void main(String[] args) {
		
		Super_keyword_overriding_parameter m1=new Super_keyword_overriding_parameter();
		m1.login(100,2.5);
	}

}
