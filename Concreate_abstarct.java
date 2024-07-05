package basics.programm;

abstract class Programming
{
	abstract void add();
	abstract void sub();
	static void  addition()
	{
		System.out.println("hello");
	}
}

public class Concreate_abstarct extends Programming{
	void mul()
	{
		System.out.println("learning");
	}

	public static void main(String[] args) {
		Concreate_abstarct n1=new Concreate_abstarct();
		n1.add();
		n1.sub();
		n1.mul();
		addition();
	

	}
	
	void add() {
		
		
	}

	
	void sub() {
		
		
	}

}
