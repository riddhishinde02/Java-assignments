package assignment1;
import java.util.*;
public class quadraEquation {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a:");
		a=sc.nextInt();
		System.out.println("Enter value of b:");
		b=sc.nextInt();
		System.out.println("Enter value of c:");
		c=sc.nextInt();
		float d=2*a;
		float q1=(float)((-b)+Math.sqrt(b*b)-(4*a*c));
		float q2=(float)((-b)-Math.sqrt(b*b)-(4*a*c));
		float f1=q1/d;
		float f2=q2/d;
		System.out.println("Factor 1: "+f1);
		System.out.println("Factor 2: "+f2);
		




	}

}
