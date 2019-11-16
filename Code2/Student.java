package t2;

public class Student {
	String Stud="Sanket";
	int id=041;
	float sub1=100f;
	float sub2=100f;
	float sub3=100f;
	float sub4=100f;
	float sub5=100f;
	
	float p;
	String a="Distinction";
	String b="1st Class";
	String c="2nd class";
	String d="Fail";
	
	
	
	void print() 
	{
		if((sub1 < 40f) || (sub2 < 40f) || (sub3 < 40f) || (sub4 < 40f) || (sub5 < 40f))
		System.out.println("Grade=" + d);
		
		else if((sub1 > 100f) || (sub2 > 100f) || (sub3 > 100f) || (sub4 > 100f) || (sub5 > 100f))
			System.out.println("Percent 100 tak hi hote hain");
		
		else
		{
			float avg=(sub1+sub2+sub3+sub4+sub5)/5;
			
			if(avg>=75 && avg <= 100)
						System.out.println("Grade=" + a);
			
			else if(avg>=60 && avg < 74.9f)
						System.out.println("Grade=" + b);
	
			else if(avg>=40 && avg < 59.9f)
						System.out.println("Grade=" + c);
		}
		
	}
	
	
}
