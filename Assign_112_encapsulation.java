package revision_daily;

public class Assign_112_encapsulation {
	
	private int age=18;
			public int getAge()
			{
		return age;
			}
	public void setAge(int age)
	{
this.age=age;   //local to global
	}
	
	private String name="ekta";
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	private int  password=12;
	

	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public static void main(String[] args) {
		Assign_112_encapsulation a=new Assign_112_encapsulation();
		a.setAge(30);
		System.out.println(a.getAge());
a.setName("abhi");
System.out.println(a.getName());
a.setPassword(14);
System.out.println(a.getPassword());


	}

}
