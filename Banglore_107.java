package learning_collection;


class  Delhi
{
static void vehicle()
{
System.out.println("hi");	
}

static void buses()
{
	System.out.println("hello");	
}
}
public class Banglore_107 extends Delhi{
	void add()
	{
		System.out.println("bii");
	}
	public static void main(String[] args) {
		
		 Delhi s1=new  Banglore_107();
		 s1.vehicle();//will able to call  parent class methods 
		 s1.buses();
		 new Banglore_107().add();	//this will call child class methods 
		 }

}
