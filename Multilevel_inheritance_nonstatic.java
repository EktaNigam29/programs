package inhertance_java;
class Program
{
	void add()
	{
		int a=400;
		int b=50;
		int sum=a+b;
		System.out.println(sum);
	}
}
class Learning extends Program
{
void sub()	
{
	int a=400;
	int b=50;
	int sub=a-b;
	System.out.println(sub);
}
}
public class Multilevel_inheritance_nonstatic extends Learning
{
void div()
{
	int a=400;
	int b=50;
	int div=a/b;
	System.out.println(div);
}
	public static void main(String[] args) {
		Multilevel_inheritance_nonstatic n1=new Multilevel_inheritance_nonstatic();
		n1.add();
		n1.sub();
		n1.div();

	}

}
