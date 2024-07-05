package abstractclassprograms;
interface Google
{
	void mul();
	
}
class Walmart
{
	static void sub()
	{
		System.out.println("Add to cart");
	}
}
public class Extends_implements extends Walmart implements Google{
public void mul() {
		System.out.println("Hi");
		
	}

	public static void main(String[] args) {
		
		Extends_implements n1=new Extends_implements();
		n1.mul();
		sub();
		

	}

	
	public void add1() {
		
		
	}

}
