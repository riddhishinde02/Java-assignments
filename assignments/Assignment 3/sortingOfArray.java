package Assignment3;

public class sortingOfArray {

	public static void main(String[] args) {
		
		int arr[]= {29,48,41,30,96,50,10,20,7,2,100,39};
		int n=arr.length;
		int i,j,num;
		
		System.out.println("Array before sorting:\n");
		for(i=0;i<n;i++)
		{
			System.out.print(" "+arr[i]);
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					num=arr[i];
					arr[i]=arr[j];
					arr[j]=num;
				}
			}
		}
		System.out.println("\n\nArray after sorting:\n");
		for(i=0;i<n;i++)
		{
			System.out.print(" "+arr[i]);
		}
		

	}

}
