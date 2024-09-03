package assignment1;
import java.util.*;
public class swapping {
	int a,b,s;
	void swap(int a,int b)
	{
		s=a;
		a=b;
		b=s;
		System.out.println("Ater swapping:");
		System.out.println("value of a: "+a+ "\nvalue of b: " +b);
		
	}

	public static void main(String[] args) {
		swapping obj=new swapping();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		obj.a=sc.nextInt();
		System.out.println("Enter second number: ");
		obj.b=sc.nextInt();
		System.out.println("Before swapping:");
		System.out.println("value of a: "+obj.a+ "\nvalue of b: " +obj.b);
		obj.swap(obj.a,obj.b );
		

	}

}
