package Assignment3;
import java.util.Scanner;
public class searchingArrayEle {

	public static void main(String[] args) {
		int arr[]= {29,48,41,30,96,50,10,20,7,2,100,39};
		int n=arr.length;
		int i,a=0,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Element: ");
		num=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(arr[i]==num)
			{
				a=1;
			}
			
		}	
		if(a==1)
		{
			System.out.println("Element is present in an array.");
		}
		else
		{
			System.out.println("Element not found.");
		}
		

	}

}
