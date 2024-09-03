package PracticeJava;

import java.util.Scanner;

public class queueDemo {
	int rear=-1,front=-1;
	int size=5,i;
	int[] queue=new int[5];
	
	void enqueue(int value)
	{
		if(isFull()==1)
		{
			System.out.println("Queue Is Full");
		}
		else
		{
			if(front==-1)
			{
				rear++;
				queue[rear]=value;
				//display();
			}
		}
	}
	
	void dequeue()
	{
		int i;
		if(isEmpty()==1)
		{
			System.out.println("Queue Is Empty");
		}
		else
		{
			
			for(i=0;i<rear-1;i++)
			{
				queue[i]=queue[i+1];
			}
			if(rear<size)
			{
				queue[rear]=0;
			}
			rear--;
		}
		return;
			
	}

	int isEmpty()
	{
		if(front==-1  && rear==-1)
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
		if(rear==size-1)
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
			System.out.println("\nQueue is Empty:");
		}
		else
		{
			System.out.println("\nElements Of Queue:");
			for(i=0;i<=rear;i++)
			{
				System.out.println(" "+queue[i]);
			}
		}
	}

	public static void main(String[] args) {
		
		queueDemo qd=new queueDemo();
		String ch1="y";
		int ch2;
		
		while(ch1.equals("y"))
		{
			System.out.println("1.Enqueue  2.Dequeu  3.Print ");
			Scanner sc = new Scanner(System.in);
			System.out.println("\nEnter Choice:");
			ch2=sc.nextInt();
			
			switch(ch2)
			{
				case 1:
				{
						int v;
						System.out.println("\nEnter Value in Queue");
						v=sc.nextInt();
						qd.enqueue(v);
						break;
				}
				case 2:
				{
					
					qd.dequeue();
				
					break;
				}
				case 3:
				{
					qd.display();
					break;
				}
				default:
				{
					System.out.println("\nWrong choice..");
					
				}
				
				
			}
			
		}
		

		
	}

}
