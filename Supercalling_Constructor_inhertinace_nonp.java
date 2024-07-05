package inhertance_java;

class Set_Url
{
	Set_Url()
	{
		System.out.println("Set_Url");
	}
}

class Launch_Browser extends Set_Url
{
	Launch_Browser()
	{
		System.out.println("Launch_Browser");
	}
}

public class Supercalling_Constructor_inhertinace_nonp extends Launch_Browser
{
	Supercalling_Constructor_inhertinace_nonp()
	{
		System.out.println("Supercalling_Constructor_inhertinace_nonp");
	}
	public static void main(String[] args) {
		
		Supercalling_Constructor_inhertinace_nonp n1=new Supercalling_Constructor_inhertinace_nonp();
	}

}
