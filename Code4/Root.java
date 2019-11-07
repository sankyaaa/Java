package lab2_4;

import java.util.Scanner;

public class Root {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		Exam e1 = new Exam();

		
		System.out.println("Enter Total Marks");
		e1.puttotalMarks(scan.nextInt());

		System.out.println("Enter examName");
		e1.putexamName(scan.nextLine() + scan.nextLine());

		System.out.println("Enter Duration");
		e1.putDur(scan.nextFloat());

		System.out.println("**************************************************************");
		System.out.println("id=" + e1.gettotalMarks());
		System.out.println("name=" + e1.getexamName());

		
		System.out.println("**************************************************************");

		
		System.out.println("Enter Total Marks,ExamName and duration");
		Exam e2 = new Exam( scan.nextInt() , scan.nextLine() + scan.nextLine(), scan.nextFloat());
		e2.p();

		System.out.println("**************************************************************");
		e1.p();
		e2.p();
		

	}

}
