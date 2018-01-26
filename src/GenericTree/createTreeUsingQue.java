package GenericTree;

import java.util.LinkedList;
import java.util.Scanner;


public class createTreeUsingQue {
	static Scanner s  = new Scanner(System.in);
	static GenericTreeNode<Integer> creattreeQue(){
	   System.out.println("enter data");
	   int data = s.nextInt();
	   GenericTreeNode<Integer> root = new GenericTreeNode<>(data);
	   LinkedList<GenericTreeNode<Integer>> Queue = new LinkedList<>();
	   Queue.addLast(root);
	   while(!Queue.isEmpty()){
		GenericTreeNode<Integer> currNode = Queue.removeFirst();
		System.out.println("No of child");
		int NoOfChild = s.nextInt();
		for(int i=0; i<NoOfChild; i++){
			System.out.println("Enter "+i+"th child data of "+currNode.data);
			int child_data = s.nextInt();
			GenericTreeNode<Integer> child = new GenericTreeNode<>(child_data);
			currNode.children.add(child);
			Queue.addLast(child);

			}
	   }
	   return root;
	}
	public static void main(String[] args){
		GenericTreeNode<Integer> root = creattreeQue();
		printTree(root);
	}
	private static void printTree(GenericTreeNode<Integer> root) {
		// TODO Auto-generated method stub
		String toBePrinted = root.data +": ";
		for(int i=0; i<root.children.size();i++){
			toBePrinted += root.children.get(i).data+ ", "; 
		}
		System.out.println(toBePrinted);
		for(int i=0; i<root.children.size(); i++){
			printTree(root.children.get(i));
		}
		
	}

}
