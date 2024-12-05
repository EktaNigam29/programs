package practise;

public class Construtoroverloading_this {
String name;
int roll;
int id;
float fee;

Construtoroverloading_this(String name, int roll, int id)
{
	
	
	this.name=name;
	this.id=id;
	this.roll=roll;
	
}

Construtoroverloading_this(String name, int roll, int id, float fee)
{
	
	this(name,id,roll);
	this.fee=fee;
	
	
}
void display()
{
	System.out.println(name + " " + id + " " + roll + " " +fee);
}
	
	public static void main(String[] args) {
		Construtoroverloading_this obj=new Construtoroverloading_this("ekta", 89,86);
		
		obj.display();

	Construtoroverloading_this obj1=new Construtoroverloading_this("abhi", 1234,894,89.6456f);
		
		obj1.display();
	}

}
