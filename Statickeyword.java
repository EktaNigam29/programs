package practise;

public class Statickeyword {
	
	
	String name;
	int id;
	static String company="TCS";
	
	static void change()
	{
		
		company="Wipro";
	}
	
	
	Statickeyword (String name ,int id)
	
	{
		this.name=name;
		this.id=id;
		
	}
	
	void display()
	{
		
		System.out.println(name + " " + id +" "+company);
	}
	public static void main(String[] args) {

		Statickeyword  obj=new Statickeyword ("Ekta" ,123);
		change();
		obj.display();
		
	}

}
