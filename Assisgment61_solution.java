package abstractclassprograms;

public class Assisgment61_solution {

	public static void main(String[] args) {
		/*try{
			int a=1/0;
		
		System.out.println(a);
		}
		
		catch(ArithmeticException a1)
		{
			System.out.println("Handle Exception");
		}*/
		
		try {
		int a=1/0;
		System.out.println(a);
		}
		catch(ArithmeticException v1)
		{
			System.out.println("Handle exception");
		}
		finally
		{
		System.out.println("hello");
		}

	}

}
