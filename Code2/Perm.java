package Code2;

public class Perm extends Emp {

	float bsal;
	float hra;
	float da;

	void calsal() {

		sal = (bsal + ((hra / 100f)*bsal) + ((da / 100f))*bsal);
	}

	public Perm() {
		// TODO Auto-generated constructor stub
	}

	public Perm(int id, String name, float bsal, float hra, float da) {
		super(id, name);
		this.bsal = bsal;
		this.hra = hra;
		this.da = da;
	}

	void print() {
		super.print();
		System.out.println("Emp Base Salary is " + bsal);
		System.out.println("Emp HRA is " + hra);
		System.out.println("Emp DA is " + da);
		calsal();
		System.out.println("Employee Total Salary is " + sal);

	}
}
