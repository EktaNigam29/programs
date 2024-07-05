package abstractclassprograms;
class Newone
{
	static void add()
	{
	System.out.println("concreate method1");	
	}
	static void sub()
	{
		System.out.println("concreate method2");		
	}
}
abstract class Newtwo extends Newone
{
	abstract void add1();
	abstract void sub1();

	 static void add3()
	 {
		 System.out.println("concreate method3");	
	 }
	void sub3()
	{
		System.out.println("concreate method");	
}
	
}
public class Concreatemethod_abtractmethod extends Newtwo 
{
	static void addition()
	{
		System.out.println("concreate method4");	
	}
	static void subtraction()
	{
		System.out.println("concreate metho5d");	
	}
void add1() {
		
		System.out.println("concreate method 6");
	}

	void sub1() {
		
		System.out.println("concreate method 7");	
	}
	public static void main(String[] args) {
	
		Concreatemethod_abtractmethod a1=new Concreatemethod_abtractmethod();
        a1.add1();
         a1.sub1();
         a1.sub3();
add();
sub();
add3();
addition();
subtraction();



	}

	
}



