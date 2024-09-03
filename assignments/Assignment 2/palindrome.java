package assignment;
import java.util.Scanner; 
public class palindrome {

	public static void main(String[] args) {
		
		int n,r,s=0,c,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		n=sc.nextInt();
		c=n;
		while(n>0)
		{
			r=n%10;
			s=((s*10)+r);
			n=n/10;
		}
		if(c==s)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");
		}


	}

}
