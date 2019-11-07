package lab2_1;

import java.util.Scanner;

public class Root {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		Emp e1 = new Emp();


		
		System.out.println("Enter ID");
		e1.putid(scan.nextInt());

		System.out.println("Enter Name");
		e1.putname(scan.nextLine() + scan.nextLine());

		System.out.println("Enter Sal");
		e1.putfloart(scan.nextFloat());

		System.out.println("**************************************************************");
		System.out.println("id=" + e1.getid());
		System.out.println("name=" + e1.getname());

		
		System.out.println("**************************************************************");

		
		System.out.println("Enter Id,Name and Salary");
		Emp e2 = new Emp( scan.nextInt() , scan.nextLine() + scan.nextLine(), scan.nextFloat());
		e2.p();

		System.out.println("**************************************************************");
		e1.p();
		e2.p();
		

	}

}
