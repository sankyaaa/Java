package lab2_3;

import java.util.Scanner;

public class Peri {
int side,len,bri;
float rad;

	public void findPerimeter(int side)
	{
		System.out.println("perimeter of sq="+(4*side));
	}
	public void findPerimeter(float side)
	{
		System.out.println("radious of ccl="+(3.14f*2*side));
	}
	
	public void findPerimeter(int len, int bri)
	{
		System.out.println("perimeter of rect="+(2*len +2*bri));	
	}
	
}
