package abstractclassprograms;
interface Flipkart
{
	void add_products();
	void search_products();
}
abstract class Flipkart2 implements Flipkart
{
	abstract void add_cart();
	abstract void add_wishlist();
	static void addition()
	{
		System.out.println("Purchased");
	}
	static void add()
	{
		System.out.println("Still Seraching");
	}
}

public class Interface_absclass_class extends Flipkart2{
public void add_products() {
		
	System.out.println("Addition of products");	
	}
	
	public void search_products() {
		
		System.out.println("Searching products");
	}
	
	void add_cart() {
		System.out.println("Thinking");
		
	}
	
	void add_wishlist() {
		
		System.out.println("Wishlist");
	}

	static void buy()
	{
		System.out.println("Paymnet done");
	}
	static void delete()
	{
		System.out.println("Removing products");
	}

	public static void main(String[] args) {
		new Interface_absclass_class(). add_products();
		new Interface_absclass_class(). search_products();
		new Interface_absclass_class(). add_cart();
		new Interface_absclass_class(). add_wishlist(); 
		addition();
		add();
		buy();
		delete();
		

	}
	
	
}
