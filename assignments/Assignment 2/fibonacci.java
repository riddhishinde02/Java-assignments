package assignment;
import java.util.Scanner; 
public class fibonacci {

	public static void main(String[] args) {
		
		int n,i,f,a=0,b=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			System.out.println(a);
			f=a+b;
			a=b;
			b=f;
		}


	}

}
