package strings_assisgnment;

public class Assign_94_96_97 {

	public static void main(String[] args) {
		String name="grotech";
		System.out.println(name.matches(".r(.*)"));//r is at the second place or not(indexing-2)
		String name1="automation testing";
		System.out.println(name1.matches(".........n(.*)"));//n is at the middle or not(indexing-9)
		String name2="smitth";
		System.out.println(name2.matches("s....h"));
		

	}

}