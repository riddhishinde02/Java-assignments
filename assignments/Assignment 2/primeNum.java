package assignment;

import java.util.Scanner; 
public class primeNum {

	public static void main(String[] args) {
		int i,j,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		n=sc.nextInt();
		for(i=2;i<=n;i++)
		{
			int count=0;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println(i+" ");
			}
		}
		

	}

}
