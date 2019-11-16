package t1;

public class Emp {
int id;
String name="Sanket";
float total_salary;
int basic_salary=10000;
float hra=0.18f*basic_salary;
float da=0.2f*basic_salary;	

void print()
{
	System.out.println("Id=" + id);
	System.out.println("Name=" + name);
	System.out.println("HRA=" + hra);
	System.out.println("Basic_salary=" + basic_salary);
	System.out.println("DA=" + da);
	System.out.println("Total Salary=" + ts());
}
double ts()
{
	return hra+da+basic_salary;
}
}