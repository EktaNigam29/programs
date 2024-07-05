package abstractclassprograms;

abstract class Grand_parent
{
	abstract void add();
}
abstract class Parent_class extends Grand_parent
{
	void sub()
	{
		System.out.println("subtraction");
	}

	
}
public class Noabstraction_absclass extends Parent_class {
	void add() {
		
		System.out.println("Addition");
	}


	static void mul()
	{
		System.out.println("multiplication");
	}

	public static void main(String[] args) {
		Noabstraction_absclass m1= new Noabstraction_absclass();
		m1.add();
	mul();
	
	}

}
