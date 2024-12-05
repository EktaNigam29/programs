package practise;

public class Reversewordinsentence {

	public static void main(String[] args) {
		String str="Java is a Progamming language";
		str=str.toLowerCase();
		String[] s=str.split(" ");
		String reverseString="";
		for(int i=0; i<s.length;i++)
		{
			String s2=s[i];
			System.out.println(s2);//for better understanding of program print statement is given
			String revword="";
			for(int j=s2.length()-1;j>=0;j--)
			{
				revword=revword+s2.charAt(j);
				System.out.println(revword);//for better understanding of program print statement is given
			}
			reverseString =reverseString + revword+" ";
		}
System.out.println("Original String is  " + str);
System.out.println("Reverse String is " +reverseString);

	}

}
