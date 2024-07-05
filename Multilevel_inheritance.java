package abstractclassprograms;
interface Email
{
	void email_as_login();
}
interface Mobile_no
{
	void mobile_no_as_log();
}

public class Multilevel_inheritance implements Email,Mobile_no
{public void mobile_no_as_log() {
	
	System.out.println("Happy Customer");
}

public void email_as_login() {
	System.out.println("Satisfied Customer");
	
}

static void login()
{
	System.out.println("Successfully logged in");
}
	public static void main(String[] args) {
		Multilevel_inheritance n1= new Multilevel_inheritance();
		n1.mobile_no_as_log();
		n1.email_as_login();
		login();
		

	}
	
	
}
