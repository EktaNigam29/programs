//program on one interface containing two abstract methods


package revision_daily;


interface Delhi{
	void add();
	void subtract();
}

public class Assign_2 implements Delhi


{public void add() {
	System.out.println("add");	
		
	}

	
	public void subtract() {
	System.out.println("sub");
		
	}
	
	static void mul() {
		System.out.println("div");
	}

	public static void main(String[] args) {
		
new Assign_2().add();
new Assign_2().subtract();
mul();
	}

	
	

}
