package Code2;

import java.util.Scanner;

public class Root {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Account a1 = new Account();

		while (true) {
			System.out.println("Select 1 for Deposite And 2 for Withdraw 3 for Balance Check");
			int count = scan.nextInt();
			switch (count) {
			case 1:
				System.out.println("Enter amount to Deposite");
				a1.dep(scan.nextFloat());
				break;
			case 2:
				System.out.println("Enter amount to Withdraw");
				try {
					a1.wd(scan.nextFloat());
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e);
				}
				break;
			case 3:
				a1.chk();
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}

		}
		//scan.close();
	}
}
