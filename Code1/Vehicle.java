package Code1;

public class Vehicle {

	String name;
	String color;
	float speed;

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String name, String color, float speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}

	void print() {
		System.out.println("Name of car is " + name);
		System.out.println("Color of car is " + color);
		System.out.println("Speed of car is " + speed);
	}
	
	void accelerate() {

		System.out.println("Speed accelerating ");
	}

}
