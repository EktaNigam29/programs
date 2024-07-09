package strings_assisgnment;

interface Hi
{
	void add();
	void addition();
}

interface Hello
{
	void add1();
	void addition1();
}
public class Assign_practice implements Hi, Hello {
	static void mul()
	{
		System.out.println("multiplication");
	}

	public void add() {

	System.out.println("add");	
	}

	
	public void addition() {
		
		System.out.println("addition1");	
	}


	public void add1() {
		
		System.out.println("happy");
	}


	public void addition1() {
		
		System.out.println("tester");
	}


	public static void main(String[] args) {
		new Assign_practice().add();
		new Assign_practice().addition();
		new Assign_practice().add1();
		new Assign_practice().addition1();
		
		mul();

	}

	




}
