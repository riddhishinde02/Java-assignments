package Assignment3;
import java.util.Scanner;
public class sumArrayEle {

	public static void main(String[] args) {
		int arr[]=new int[6];
		int i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 6 elements in array:");
		for(i=0;i<6;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<6;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("Sum of all array elements: "+sum);

	}

}
