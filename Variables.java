package practise;

public class Variables {
int x=40;
static String a="Ekta";

void display()
{
	int y=50;
	int z=x+y;
	System.out.println(z);
}

int display1()
{
	int x=10-3;
	System.out.println(x);
	return x;
	
}
	public static void main(String[] args) {
		
		Variables v=new Variables();
		v.display();
		v.display1();
		System.out.println(v.x);
		System.out.println(a);
		
	}

}
