package strings_assisgnment;

public class THis_assign120 {
	
	int age;
	String name;
	double salary;
	void add(int age, String name, double salary)
	{
		System.out.println(age);
		System.out.println(name);
		System.out.println(salary);
		this.age=age;//local to variable
		this.name=name;
		this.salary=salary;
	}

	public static void main(String[] args) {
	
		THis_assign120 s1=new THis_assign120();
		s1.add(25, "ramesh", 25.50);
	System.out.println(s1.age);
	System.out.println(s1.name);
	System.out.println(s1.salary);
	
	}

}
