package basics.programm;

abstract class Learning
{
	abstract void add();
	static void sub()
	{
		System.out.println("1");
	}
}

public class Concreate_revision extends Learning
{
void mul()
{
	System.out.println("2");
}
	public static void main(String[] args) {
		
		new Concreate_revision().add();
		sub();
		new Concreate_revision().mul();
		
	}
	
	void add() {
		
		
	}

}
