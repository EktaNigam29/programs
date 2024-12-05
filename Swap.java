package practise;

public class Swap {

	public static void main(String[] args) {
		String str1="ABC";
		String str2="DEF";
		
		str1=str1+str2;
		str2=str1.substring(0, str1.length()-str2.length());
		str1=str1.substring(str2.length());
		System.out.println("Swap Value of str1 is  " +str1);
		System.out.println("Swap Value str2 is " +str2);
		

	}

}
