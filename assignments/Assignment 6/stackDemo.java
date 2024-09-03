package PracticeJava;
import java.util.*;
public class stackDemo {
	
	int top=-1,val,i;
	int size=5;
	int[] stk=new int[5];
	
	void push(int value)
	{
		if(isFull()==1)
		{
			System.out.println("Stack Is Full");
		}
		else
		{
			top++;
			stk[top]=value;
			display();
		}
	}
	
	void pop()
	{
		if(isEmpty()==1)
		{
			System.out.println("Stack Is Empty");
		}
		else
		{
			top--;
			display();
		}
	}
	
	int isEmpty()
	{
		if(top<0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
		
	
	}
	
	int isFull()
	{
		if(top==size)
		{
			return 1;
		}
		else {
			return 0;
		}
	}
	
	void display()
	{
		if (isEmpty()==1)
		{
			System.out.println("\nStack is Empty:");
		}
		else
		{
			System.out.println("\nElements Of array:");
			for(i=0;i<=top;i++)
			{
				System.out.println("" +stk[i]);
			}
		}
	}
	

	public static void main(String[] args) {
		
		stackDemo sd=new stackDemo();
		String ch1="y";
		int ch2;
		
		while(ch1.equals("y"))
		{
			System.out.println("1.Push  2.Pop  3.Print ");
			Scanner sc = new Scanner(System.in);
			System.out.println("\nEnter Choice:");
			ch2=sc.nextInt();
			
			switch(ch2)
			{
				case 1:
				{
						int v;
						System.out.println("\nEnter Value in Stack");
						v=sc.nextInt();
						sd.push(v);
						break;
				}
				case 2:
				{
					//System.out.println("\nDelete Value in Stack");
					sd.pop();
					break;
				}
				case 3:
				{
					sd.display();
					break;
				}
				default:
				{
					System.out.println("\nDo you wish to perform again(y/n)");
					ch1=sc.nextLine();
				}
					
				
			}
		}
		

	}

}
