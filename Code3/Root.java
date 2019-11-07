package lab2_3;

import java.util.Scanner;

import lab2_2.Stud;

public class Root {
	public static void main(String[] args) {

		Peri a = new Peri();
while(true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1.square 2.circle 3.rectangle");
		switch(scan.nextInt())
		{
		case 1:
			a.findPerimeter(scan.nextInt());
			break;
		case 2:
			a.findPerimeter(scan.nextFloat());
			break;
		case 3:
			a.findPerimeter(scan.nextInt(),scan.nextInt());
			break;
		default:
			System.out.println("Invalid");
			break;
			

		}
		}
	}
}
