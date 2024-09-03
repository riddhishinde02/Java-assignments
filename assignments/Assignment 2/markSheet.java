package assignment;
import java.util.Scanner; 
public class markSheet {

	public static void main(String[] args) {
		
		int marks[] = new int[6];
		int i;
		int tot=0,fs=0;
		float per;
		System.out.println("Enter 6 subject marks(out of 100):");
		Scanner sc=new Scanner(System.in);
		for(i=0;i<6;i++)
		{
			marks[i]=sc.nextInt();
			tot=tot+marks[i];
			
		}
		per=(float)((tot/600)*100);
		for(i=0;i<6;i++)
		{
			if(marks[i]<40)
			{
				fs=fs+1;
			}
		}
		if(fs>3)
		{
			System.out.println("The result of student:Failed");
			System.out.println("The total failed subjects:"+fs);
		}
		else if (fs>0 && fs<=3)
		{
			System.out.println("The result of student:ATKT");
			System.out.println("The total failed subjects:"+fs);
			
		}
		else
		{
			System.out.println("The result of student:Passed");
		}
		

	}

}
