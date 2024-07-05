package inhertance_java;

public class This_calling_parameter {
	
	 This_calling_parameter()
	 {
		 System.out.println(1);
	 }
	 This_calling_parameter(int a,int b)
	 {this();
		 System.out.println(2);
	 }
	 This_calling_parameter(int a,double b)
	 {this(20,50);
		 System.out.println(3);
	 }
	public static void main(String[] args) {
		
		This_calling_parameter m1=new This_calling_parameter(20,5.5);
	}

}
