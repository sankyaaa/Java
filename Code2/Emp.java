package Code2;

public class Emp {
	int id;
	String name;
	float sal;
	
	void print() {
		System.out.println("Emp ID is " + id);
		System.out.println("Emp name is " + name);


	}
	
	void calsal() {
		//System.out.println("Emp Total Salary is " + sal);
	}

	public Emp() {
		// TODO Auto-generated constructor stub
	}
	public Emp(int id, String name) {
			this.id=id;
			this.name=name;
	}
	
}
