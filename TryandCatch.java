package practise;

public abstract class TryandCatch {

	public static void main(String[] args) {
	try{int a=9/9;
	System.out.println(a);

	}
	catch(ArithmeticException e)
	{
		System.out.println("execption handled " +e);
	}
finally
{
	System.out.println("program will execute");
}
}
}
