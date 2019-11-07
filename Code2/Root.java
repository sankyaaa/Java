package lab2_2;

import java.util.Scanner;

public class Root {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		Stud e1 = new Stud();

		System.out.println("Enter ID");
		e1.putid(scan.nextInt());

		System.out.println("Enter Name");
		e1.putname(scan.nextLine() + scan.nextLine());

		System.out.println("Enter S1");
		e1.puts1(scan.nextFloat());
		System.out.println("Enter S2");
		e1.puts2(scan.nextFloat());

		System.out.println("**************************************************************");
		System.out.println("id=" + e1.getid());
		System.out.println("name=" + e1.getname());

		System.out.println("**************************************************************");

		System.out.println("Enter Id,Name and Sub1,sub2 percent");
		Stud e2 = new Stud(scan.nextInt(), scan.nextLine() + scan.nextLine(), scan.nextFloat(), scan.nextFloat());

		System.out.println("**************************************************************");
		e1.p();
		e2.p();

	}

}
