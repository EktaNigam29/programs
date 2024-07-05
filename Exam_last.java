package basics.programm;

import java.util.Scanner;

public class Exam_last {
	static Scanner s1= new Scanner(System.in);
	
	static void add()
	{
		int a=s1.nextInt();
		int b=s1.nextInt();
		int c=s1.nextInt();
		int d=s1.nextInt();
		
		int sum=a+b+c+d;
		System.out.println("The addition of a,b,c and d " +sum);
	}
	public static void main(String[] args) {
		
		
	add();

	}

}
