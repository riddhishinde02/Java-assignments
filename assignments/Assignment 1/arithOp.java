package assignment1;
import java.util.*;
public class arithOp {
	int a,b,ans;
	float d;
	void add()
	{
		ans=a+b;
		System.out.println("Addition: "+ans);
	}
	void sub()
	{
		add();
		ans=a-b;
		System.out.println("Substraction: "+ans);
	}
	void mul()
	{
		sub();
		ans=a*b;
		System.out.println("Multiplication: "+ans);
	}
	void div()
	{
		mul();
		d=a/b;
		System.out.println("Division: "+d);
	}

	public static void main(String[] args) {
		arithOp obj=new arithOp();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		obj.a=sc.nextInt();
		System.out.println("Enter second number: ");
		obj.b=sc.nextInt();
		obj.div();
		

	}

}
