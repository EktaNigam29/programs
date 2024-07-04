package Assisgnment.program;

public class Main_method_overloading {
	
	public void main(int a)//we overload static methods also
	{
		System.out.println("Addition");
	}
	public void main(int c,int d)
	{
		System.out.println("sub");
	}

	public  void main(double g)
	{
	System.out.println("multiply");	
	}


	public static void main(String[] args) {
		Main_method_overloading n1=new Main_method_overloading();
		
		n1.main(11);
		n1.main(12,60);
		n1.main(34.57);
	}

}
