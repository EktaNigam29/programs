package strings_assisgnment;

class Hurray
{
	static void add() {
		System.out.println("upcasting");
	}
}


public class Amazon_assi120 extends Hurray{
static void mul()
{
	System.out.println("addition");
}
void div()
{
	System.out.println("division");
}
	public static void main(String[] args) {
		Hurray a=new Amazon_assi120();//implicitly upcasting
		a.add();
		mul();
		Hurray a1=(Hurray) new Amazon_assi120();//explicitly upcasting 
		a1.add();
		Amazon_assi120 g1=(Amazon_assi120) a;//downcasting
		g1.mul();
	
		
	}

}
