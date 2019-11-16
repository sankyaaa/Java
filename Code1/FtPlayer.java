package Code1;

public class FtPlayer {
	int goals;
	String name;

	void printDetails() {
		System.out.println(name + " Scored " + goals + " runs");
	}

	public FtPlayer() {
		// TODO Auto-generated constructor stub
	}

	public FtPlayer(String name, int goals) {
		this.name = name;
		this.goals = goals;
	}

}
