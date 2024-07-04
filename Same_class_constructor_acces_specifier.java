package Assisgnment.program;

public class Same_class_constructor_acces_specifier {
	
	protected Same_class_constructor_acces_specifier()
	{
		System.out.println("Hi");
	}
	public static void main(String[] args) {
		
		Same_class_constructor_acces_specifier n1= new Same_class_constructor_acces_specifier();
	}

}
