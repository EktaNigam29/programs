package strings_assisgnment;

public class Assign123_String_buffer_methods {

	public static void main(String[] args) {
		
		String fname="ekta";
		String lname="nigam";
		
		System.out.println(fname.concat(lname));//without space
		System.out.println(fname.concat(" ") .concat(lname));//wit space
	
		StringBuffer name=new StringBuffer("ekta nigam");//insert
		System.out.println(name.replace(5, 10, "learner"));//replace
	System.out.println(	name.insert(5, "abhishek "));//insert
	System.out.println(name.append(" learner"));//append
	System.out.println(name.delete(22, 29));//delete
	//System.out.println(name.reverse());//reverse
	System.out.println(name.charAt(1));//charAt
	System.out.println(name.capacity());//capacity
	System.out.println(name.length());
	System.out.println(name.substring(2));
	System.out.println(name.substring(5, 15));
	
	
	
		
		
		


	}
}