package Code1;

public class Car extends Vehicle {

	String gear;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(String name, String color, float speed, String gear) {
		super(name,color,speed);
		this.gear=gear;
	}
	
	void print() {
		super.print();
		System.out.println("Gear type is " + gear);
	}
	
	void accelerate(float speed) {
		super.accelerate();
		this.speed+=speed;
		System.out.println("New speed of " + name + " is " + this.speed);

		
	}
	
}
