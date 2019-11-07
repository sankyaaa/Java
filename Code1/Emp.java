package lab2_1;

public class Emp {

	private int id;
	private String name;
	private float sal;

	public Emp() {
		// TODO default constructor stub
	}

	int getid() {
		return id;
	}

	void putid(int id) {
		this.id = id;
	}

	String getname() {
		return name;
	}

	void putname(String name) {
		this.name = name;
	}

	void putfloart(float sal) {
		this.sal = sal;
	}

	public Emp(int id,String name, float sal) {
		// TODO Parameterized constructor stub
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	void p() {
		System.out.println("id=" + id);
		System.out.println("name=" + name);
		System.out.println("sal=" + sal);
	}
}
