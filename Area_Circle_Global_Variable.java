package Assisgnment.program;

public class Area_Circle_Global_Variable {
	static String name="Ekta";
	static double pi=3.14;
	
	static void area()
	
	{
		int r=7;
		double area=pi*r*r;
		System.out.println(area);
	}
	
	

	public static void main(String[] args) {
		/*String name="Riya";
		name="Paul";
		System.out.println(name);
		name="chitra";
		System.out.println(name);
		System.out.println(name);
		System.out.println(name);
		name="Riya";
		System.out.println(name)*/
		
		int r=10;
		double area=pi*r*r;
		System.out.println(area);
		area();
		
		

	}

}
