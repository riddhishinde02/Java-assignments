package Assignment3;

public class Arraycalc {
	
	int sum[][]=new int[3][3];
	int sub[][]=new int[3][3];
	int div[][]=new int[3][3];
	
	void printArray(int arr[][])
	{
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("\n");
		}
	}
	
	void calcSum(int arr1[][], int arr2[][])
	{
		int i,j;
		for( i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				sum[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(sum[i][j]+" ");
			}
			System.out.println("\n");
		}
	}
	
	void calcSub(int arr1[][], int arr2[][])
	{
		int i,j;
		for( i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				sub[i][j]=arr1[i][j]-arr2[i][j];
				System.out.print(sub[i][j]+" ");
			}
			System.out.println("\n");
		}
	}
	
	void calcDiv(int arr1[][], int arr2[][])
	{
		int i,j;
		for( i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				div[i][j]=arr1[i][j]/arr2[i][j];
				System.out.print(div[i][j]+" ");
			}
			System.out.println("\n");
		}
	}
	
	

	public static void main(String[] args) {
		
		int arr1[][]= {{10,2,6},{20,14,2},{3,0,9}};
		int arr2[][]={{7,10,3},{5,18,2},{9,8,1}};
		Arraycalc obj=new Arraycalc(); 
		System.out.println("Array 1: ");
		obj.printArray(arr1);
		System.out.println("Array 2: ");
		obj.printArray(arr2);
		System.out.println("Addition of array elements: ");
		obj.calcSum(arr1, arr2);
		System.out.println("Substraction of array elements: ");
		obj.calcSub(arr1, arr2);
		System.out.println("Division of array elements: ");
		obj.calcDiv(arr1, arr2);
		

	}

}
