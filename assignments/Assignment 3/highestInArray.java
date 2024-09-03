package Assignment3;

public class highestInArray {
	
	public static void main(String[] args) {
		
		int arr[]= {10,47,83,28,59,53,21,20,5};
		int n=arr.length;
		int i,max=0,a,b;
		a=arr[0];
		
		for(i=0;i<n;i++)
		{
			System.out.print(" "+arr[i]);
		}

		for(i=0;i<n-1;i++)
		{
			if(a<=arr[i])
			{
				a=arr[i];
			}
		}
		System.out.println("\nHighest element in an array is: "+a);
	}

}
