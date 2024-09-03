package assignment1;
import java.util.*;
public class circle {
	float pi=3.14f,a,cf;
	int radius;
	
	float area(int r)
	{
		radius=r;
		a= pi*r*r;
		return a;
		
	}
	
	float circum(int r)
	{
		radius=r;
		cf= 2*pi*r;
		return cf;
	}
	
	public static void main(String[] args) {
		
		circle c=new circle();
		Scanner sc=new Scanner(System.in);
		c.area(5);
		System.out.println("Area of circle:"+c.a);
		c.circum(5);
		System.out.println("Circumference of circle:"+c.cf);
	}

}
