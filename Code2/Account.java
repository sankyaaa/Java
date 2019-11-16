package Code2;

public class Account {

	float bal;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	void wd(float bal) throws Exception {

		if (bal < 15000.00f) {
			if (this.bal >= bal) {
				System.out.println("Previous balance was	" + this.bal  + "	Rs. Updated balance is	" + (this.bal - bal) + "Rs.");
				this.bal -= bal;
			} else {
				throw new Exception("Insufficient balance!");
			}

		} else {
			throw new Exception("User withdrawal limit on one transaction is Rs.15000/-");
		}

	}

	void dep(float bal) {
		System.out.println("Previous balance was	" + this.bal + "	Rs. Updated balance is	" + (this.bal + bal) + "Rs.");
		this.bal += bal;
	}
	
	void chk()
	{
		System.out.println("Your Balance is "+this.bal);
	}

}
