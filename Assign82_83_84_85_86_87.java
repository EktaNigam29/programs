package strings_assisgnment;

public class Assign82_83_84_85_86_87 {

	public static void main(String[] args) {
	String name="EkTa 1234";
	System.out.println(name.replaceAll("a", ""));//to replace a
	System.out.println(name.replaceAll("a", "r"));//to replace a with r
	System.out.println(name.replaceAll(" ", ""));//to remove spaces
	System.out.println(name.replaceAll("[A-Z]", ""));//to remove capital letters
	System.out.println(name.replaceAll("[a-z]", ""));//to remove lower letters
	System.out.println(name.replaceAll("[0-9]", ""));//to remove numeric values
	}

}
