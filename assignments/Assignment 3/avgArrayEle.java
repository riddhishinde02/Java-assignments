package Assignment3;
import java.util.*;
public class avgArrayEle {
	
	public static void main(String[] args) {
		int arr[]=new int[6],avg=0;
		int n=arr.length;
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
			avg=sum/n;
		}
		System.out.println("Average of all array elements: "+avg);

		
		
		
		
	}

}
