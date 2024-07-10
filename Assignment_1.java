//Create one  class containing 2 abstract classes and one abstract method in each class

package revision_daily;


abstract class Banglore{
	abstract void add();
}
abstract class Shimla extends Banglore
{
	abstract void sub();
}
public class Assignment_1 extends Shimla


{
	void sub() {
		System.out.println("addition");
		
	}


	void add() {
		
		System.out.println("subtraction");
	}
	static void mul()
	{
		System.out.println("multiplication");
	}

	public static void main(String[] args) {
		Assignment_1 s1=new Assignment_1();
		s1.sub();
		s1.add();
		mul();

	}

	


}
