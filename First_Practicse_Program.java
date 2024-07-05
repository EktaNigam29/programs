package basics.programm;

class Test
{
	void add()
	{
		int a=40;
		int b=60;
		int sum=a+b;
		System.out.println(sum);
		
	}
}
class Hi extends Test
{
	void sub()
	{
		int a=100;
		int b=50;
		int sub=a-b;
		System.out.println(sub);
	}
}

public class First_Practicse_Program extends Hi
{
	
void mod()
{
	int a=400;
	int b=50;
	int mod=a%b;
	System.out.println(mod);
}

	
	public static void main(String[] args) 
	{
		First_Practicse_Program n1=new First_Practicse_Program();
		n1.add();
		n1.sub();
		n1.mod();
		
		}
		
	}
	


