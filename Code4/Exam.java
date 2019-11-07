package lab2_4;

public class Exam {
	
	
	private int totalMarks;
	private String examName;
	private float Dur;

	public Exam() {
		// TODO default constructor stub
	}

	int gettotalMarks() {
		return totalMarks;
	}

	void puttotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	String getexamName() {
		return examName;
	}

	void putexamName(String examName) {
		this.examName = examName;
	}

	void putDur(float Dur) {
		this.Dur = Dur;
	}

	public Exam(int totalMarks,String examName, float Dur) {
		// TODO Parameterized constructor stub
		this.totalMarks = totalMarks;
		this.examName = examName;
		this.Dur = Dur;
	}

	void p() {
		System.out.println("totalMarks=" + totalMarks);
		System.out.println("examName=" + examName);
		System.out.println("Duration=" + Dur+" H");
	}
}
