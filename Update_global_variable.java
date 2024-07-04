package Assisgnment.program;

public class Update_global_variable {
	int age=10;
	static String name="Anu";
	
	void add()
	{
		int a=400;
		int b=200;
		int sum=a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
name="Ekta";
System.out.println(name);//update global static variable
Update_global_variable l1=new Update_global_variable();

System.out.println(l1.age=20);//update global non-static variable
Update_global_variable l2=new Update_global_variable();
l2.add();
	}

}
