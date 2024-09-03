package PracticeJava;
import java.util.Scanner;


class Node {
	 int data;
	 Node left;
	 Node right;
	 
	 public Node(int data)
	 {
		 this.data=data;
		 left=null;
		 right=null;
		 
	 }
	 
	 public Node() {
		// TODO Auto-generated constructor stub
	}

	public class BTree{
		 Node root;
		 
		 public void insert(int data)
		 {  
			 root=insertRec(root,data);
		 }
		 
		 public Node insertRec(Node root,int data)
		 {
			 if(root==null)
			 {
				 root = new Node(data);
				 System.out.println(root.data+ " is the root node");
			 }
			 else if(data<root.data)
			 {
				 root.left= insertRec(root.left,data);
				 System.out.println("Element added to the left side of "+root.data);
			 }
			 else if(data>root.data)
			 {
				 root.right= insertRec(root.right,data);
				 System.out.println("Element added to the right side ");
			 }
			return root;			 
		 }
		 
		 public void inorder()
		 {
			 inorderRec(root);
		 }
		 public void inorderRec(Node root)
		 {
			 if(root != null)
			 {
				 inorderRec(root.left);
				 System.out.println(root.data+" ");
				 inorderRec(root.right);
			 }
		 }
	 }

 
 

public static void main(String[] args) {
	
	 Node n=new Node();
		BTree tree= n.new BTree();
		
		String ch1="y";
		int ch2;
		
		/*tree.insert(8);
		tree.insert(7);
		tree.insert(12);
		tree.insert(15);
		tree.insert(2);
		tree.insert(5);
		 
		tree.inorder();*/
		while(ch1.equals("y"))
		{
			System.out.println("1.Insert  2.Print ");
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
						tree.insert(v);
						break;
				}
				case 2:
				{
					
					tree.inorder();
				
					break;
				}
				/*case 3:
				{
					qd.display();
					break;
				}*/
				default:
				{
					System.out.println("\nWrong choice..");
					
				}
				
				
			}
			
		}
		
		
}	

}
		
 
 
