package Assisgnment.program;

public class Global_variable_calling {
	
	int age=90;//non static global variable
	static double salary=40000.50;//static global variable
			static void add()
			{
				int a=500;
				int b=200;
				int sum=a+b;
				System.out.println(sum);
			}

	public static void main(String[] args) {
		
System.out.println(salary);//static variable print 
Global_variable_calling l1=new Global_variable_calling();//creating object
System.out.println("the age is " +l1.age);//non static print 
add();//static method calling 


	}

}
