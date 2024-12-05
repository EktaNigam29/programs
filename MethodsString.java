package practise;

import java.util.Arrays;

public class MethodsString {

	public static void main(String[] args) {
		String name="Hello World";
		String [] a=name.split(" ");
		//System.out.println(Arrays.toString(a));
//System.out.println(a[0]);

String name1="Hello&World";
String [] a1=name1.split("&");
System.out.println(a1[1]);

String name2="Hello&WorldMyIndia";
String [] a5=name2.split("My");
System.out.println(a5[1]);
String name3="India is my country and it is beautiful";
System.out.println(name3.indexOf("is" , 10));//will give indexing of it is beautiful
String b="Hello World";
System.out.println(b.replace('H', 'T'));
System.out.println(b.replace("Hello", "Tello"));
System.out.println(b.replaceAll(" ", ""));
System.out.println(b.replaceAll("Hello", "Tello"));
String s8="India is my country";
String [] name7=s8.split(" ");
System.out.println(Arrays.toString(name7));
String [] name10=s8.split(" is ");
System.out.println(name10[1]);






	}

}
