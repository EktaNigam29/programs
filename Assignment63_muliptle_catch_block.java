package abstractclassprograms;

import java.util.IllegalFormatException;
import java.util.InputMismatchException;

public class Assignment63_muliptle_catch_block {

	public static void main(String[] args) {
		int rollno[]=new int[4];
		rollno[0]=15;
		rollno[1]=16;
		rollno[2]=17;
		try{
			rollno[3]=18;
		}
		catch(ArrayIndexOutOfBoundsException a1)
		{
			System.out.println("You exceeded the size");
		}
		catch(InputMismatchException b1)
		{
			System.out.println("handle Exception IME");
		}
		catch(IllegalFormatException c1)
		{
			System.out.println("handle Exception IFE");
		}
		finally
		{
			System.out.println("I am finally handled");
		}
		
	}

}
