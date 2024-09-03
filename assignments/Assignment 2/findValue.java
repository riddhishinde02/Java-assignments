package assignment;
import java.util.Scanner;
public class findValue {

	public static void main(String[] args) {
		int a,b,n =1,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a:");
		a=sc.nextInt();
		System.out.println("Enter value of a:");
		b=sc.nextInt();
		
		for(i=1;i<=b;i++)
		{
			n=a*n;
		}
        System.out.println("Value of a^b:"+n);
	}

}