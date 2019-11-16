package Code2;

public class Contract extends Emp{
	float nohrs;
	float perhrs;


	void calsal() {

		sal= (nohrs * perhrs);
	}

	public Contract() {
		// TODO Auto-generated constructor stub
	}

	public Contract(int id, String name, float nohrs, float perhrs) {
		super(id, name);
		this.nohrs = nohrs;
		this.perhrs = perhrs;
	}

	void print() {
	super.print();
	System.out.println("Emp Work Hours are " + nohrs);
	System.out.println("Emp Cost per Hour is " + perhrs);
	calsal();
	System.out.println("Employee Total Salary is " + sal);

	}
}
