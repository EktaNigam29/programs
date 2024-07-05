package basics.programm;
interface Blinkit
{
	void add();
}

abstract class Walmart1 implements Blinkit
{
	abstract void sub();
}


public class Interface_revision extends Walmart1
{
	public void add() {
		System.out.println("Purchase");
		
	}


	void sub() {
		
		System.out.println("Search");
	}
	public static void main(String[] args) {
		Interface_revision b1=new Interface_revision();
		b1.add();
		b1.sub();
	}


	

}
