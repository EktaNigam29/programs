package practise;
//largest out of four numbers

public class Statements1 {

	public static void main(String[] args) {
		int a=20;
		int b=30;
		int c=40;
		int d=50;
		if(a>b && a>c && a>d)
		{
			System.out.println("a is maxixmum " + a);
		}
		
		else if(b>a && b>c && b>d)
		{
			System.out.println("b is maxixmum " + b);
		}
		else if(c>a && c>b && c>d)
		{
			System.out.println("c is maxixmum " + c);
		}
		else
		{
			System.out.println("d is maxixmum " + d);
		}
		

	}

}
