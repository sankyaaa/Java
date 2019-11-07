package lab2_2;

public class Stud {

	private int id;
	private String name;
	private float s1, s2;
	float avg;

	public Stud() {
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

	void puts1(float s1) {
		this.s1 = s1;
	}

	void puts2(float s2) {
		this.s2 = s2;
	}

	public Stud(int id, String name, float s1, float s2) {
		// TODO Parameterized constructor stub
		this.id = id;
		this.name = name;
		this.s1 = s1;
		this.s2 = s2;
	}

	void gf() {
		  avg= (s1 + s2)/2;
		 
		 System.out.println(s1);
		 System.out.println(s2);
		 System.out.println(avg);

		 
		if (s1 < 40f || s2 < 40f)
			System.out.println("Fail");

		else if (s1 > 100f || s2 > 100f) 
			System.out.println("Invalid");
		
		else if (avg > 75f && avg <=100f)
			System.out.println("Distinction");
		else if (avg > 60f && avg < 74.9f)
			System.out.println("1st Class");
		else if (avg > 40f && avg < 59.9f)
			System.out.println("2nd class");
		else {}
	}

	void p() {
		System.out.println("id=" + id);
		System.out.println("name=" + name);
		gf();
	}
}
