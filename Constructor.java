package practise;


class T
{int i;
boolean flag;
T()
{
	System.out.println("Hello");
}

	void display()
	{
		System.out.println("Hi");
		System.out.println(i+ " "+flag );
	
		
	}

}

public class Constructor {
	
	

	public static void main(String[] args) {
		// parameterised and default
	
T obj=new T();
obj.display();

	}

}
