package abstractclassprograms;
interface Amazon
{
	void login_with_emailid();
	void login_with_mobilenumber();
	
}

public class Class_Interface implements Amazon
{
public void login_with_emailid() {
		
		System.out.println("Emailid");
	}
	
	public void login_with_mobilenumber() {
		
		System.out.println("mobilenumber");
	}

static void add()
{
	System.out.println("Hello to all");
}
	public static void main(String[] args) {
		Class_Interface m1= new Class_Interface();
		m1.login_with_mobilenumber();
		m1.login_with_emailid();
		add();

	}
	
	
}
