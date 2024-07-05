//WAP on reverse of string and Palindrome

package strings_assisgnment;

public class Assign_67_68 {

	public static void main(String[] args) {
		String name="rotator";//"ekta"
		String input=name.toLowerCase();
		String reverse="";
		System.out.println(input.length());
		
	for(int i=input.length()-1;i>=0;i--)
		{
			char c=input.charAt(i);
			reverse=reverse+c;
			//System.out.println(reverse);
		}
		System.out.println(reverse);
boolean result=input.equals(reverse);
if(result==true)
{
	System.out.println("Palindrome");
}
else
{
	System.out.println("Not Palindrome");
}
	}

}
