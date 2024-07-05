package method.overriding;


class Learning
{
	void login()
	{
		System.out.println("Login Facebook");
	}
}

public class Super_Keyowrd_overriding_nonparameter extends Learning
{
	void login()
	{//super.login();
		System.out.println("Login Emailid");
		super.login();
	}

	public static void main(String[] args) {
		
		Super_Keyowrd_overriding_nonparameter m1=new Super_Keyowrd_overriding_nonparameter();
		m1.login();
	}

}
