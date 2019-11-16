package Code1;

public class CktPlayer {
	int runs;
	String name;

	void printDetails() {
		System.out.println(name + " Scored " + runs + " runs");
	}

	public CktPlayer() {
		// TODO Auto-generated constructor stub
	}

	public CktPlayer(String name, int runs) {
		this.name = name;
		this.runs = runs;
	}
}
