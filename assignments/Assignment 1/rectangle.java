package assignment1;
import java.util.*;
public class rectangle {
	
	int l,w;
	float a,p;
	
	float area( int l, int w)
	{
		a=l*w;
		return  a;
	}
	
	float peri( int l, int w)
	{
		p=(2*(l+w));
		return  p;
	}
	
	public static void main(String[] args) {
		rectangle r=new rectangle();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lenght of rectangle");
		r.l=sc.nextInt();
		System.out.println("Enter width of rectangle");
		r.w=sc.nextInt();
		r.area(r.l,r.w);
		System.out.println("Area of rectangle:"+r.a);
		r.peri(r.l,r.w);
		System.out.println("Perimeter of rectangle:"+r.p);
		

	}

}
