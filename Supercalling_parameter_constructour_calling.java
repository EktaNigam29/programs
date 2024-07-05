package inhertance_java;
class Set_Urll
{
	Set_Urll()
	{
		System.out.println("Set_Urll");
	}
}
class Lauch_Browser extends Set_Urll
{
	Lauch_Browser(String b)
	{
		super();
		System.out.println("Lauch_Browser");
	}
}

public class Supercalling_parameter_constructour_calling extends Lauch_Browser
{
	Supercalling_parameter_constructour_calling()
	{super("Ekta");
		System.out.println("Supercalling_parameter_constructour_calling");
		
	}
	public static void main(String[] args) {
		
		Supercalling_parameter_constructour_calling n1=new Supercalling_parameter_constructour_calling();
	}

}
