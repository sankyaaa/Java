package Code1;

public class Root {

	public static void main(String[] args) {
		
		Car bmw = new Car("GT","NAVYBLUE",50.5f,"Manual");
		bmw.print();
		bmw.accelerate(20.0f);
		
		Car audi = new Car("R8","Black",70.5f,"Auto");
		audi.print();
		audi.accelerate(50.0f);
	
	
	}
	
	
}
