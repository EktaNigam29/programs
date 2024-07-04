package Assisgnment.program;

public class constructor_overloading {
	
	constructor_overloading(int a)
	{
		System.out.println("int datatype");
	}
	constructor_overloading(boolean b)
	{this(11);
		System.out.println("boolean datatype");
	}
	constructor_overloading(char c)
	{this(true);
		System.out.println("char datatype");
	}
	constructor_overloading(String d)
	{this('A');
		System.out.println("String datatype");
	}
	
	

	public static void main(String[] args) {
		/*constructor_overloading c1=new constructor_overloading("Ekta");
		constructor_overloading c2=new constructor_overloading(true);
		constructor_overloading c3=new constructor_overloading(11);
		constructor_overloading c4=new constructor_overloading('A');*/
		
		new constructor_overloading("Ekta");
		//new constructor_overloading(true);
		//new constructor_overloading(11);
		//new constructor_overloading('A');
		
	}

}
