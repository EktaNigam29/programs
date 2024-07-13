package revision_daily;

public class Assign_124_SIB_IIB_constructor {
	static {
		System.out.println("1");
	}
	static {
		System.out.println("1");
	}
	Assign_124_SIB_IIB_constructor()
	{
		System.out.println("constructor1");
	}
	Assign_124_SIB_IIB_constructor(int a)
	{
		System.out.println("constructor2");
	}
	{
System.out.println("iib1");
	}

	{
		System.out.println("iib2");
	}

	public static void main(String[] args) {
System.out.println("main method");
new Assign_124_SIB_IIB_constructor();
new Assign_124_SIB_IIB_constructor(200);

	}

}
