package practise;




public class Const_learn {
	
	int id;
	String name;
	Const_learn(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
void display()
{
	System.out.println(id + " " + name);
}
	public static void main(String[] args) {
		Const_learn obj=new Const_learn(12, "ekta");
		obj.display();

	}

}
