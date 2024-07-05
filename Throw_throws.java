package exception_keywords;

public class Throw_throws {

	public static void main(String[] args) throws NullPointerException, InterruptedException
	{
	System.out.println("Ekta");	
	Thread.sleep(5000);
	System.out.println("Student");
	
	
	throw new NullPointerException("Sorry the cell is empty");

	}

}
