package basics.programm;


class Set_Url
{
	Set_Url(int a)
	{
		System.out.println("set_url");
	}
}
class Launch extends Set_Url
{
	Launch(String b)
	{super(90);
		System.out.println("launch");
	}
}

public class Inheritance_super_revision extends  Launch
{
	Inheritance_super_revision()
	{
		super("Ekta");
		System.out.println("revision");
	}

	public static void main(String[] args) {
		
		Inheritance_super_revision n1=new Inheritance_super_revision();
	}

}
