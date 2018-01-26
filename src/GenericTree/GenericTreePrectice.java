package GenericTree;

import java.util.Scanner;



public class GenericTreePrectice {
	static Scanner s = new Scanner(System.in);
	static GenericTreeNode<Integer> createTree(){
		System.out.println("Enter root_data");
		int root_data= s.nextInt();
		GenericTreeNode<Integer> root = new GenericTreeNode<>(root_data);
		System.out.println("Enter the no of children of "+root_data);
		int noOfChild = s.nextInt();
		for(int i=0; i<noOfChild; i++){
			GenericTreeNode<Integer> child = createTree();
			root.children.add(child);
		}
		return root;
		}
	static  void printTree(GenericTreeNode<Integer> root){
		String toBePrinted = root.data +": ";
		for(int i=0; i<root.children.size();i++){
			toBePrinted += root.children.get(i).data+ ", "; 
		}
		System.out.println(toBePrinted);
		for(int i=0; i<root.children.size(); i++){
			printTree(root.children.get(i));
		}
	}
	 static int leafNodes(GenericTreeNode<Integer> root, int count){
	      if(root.children.size() == 0){
	    	  count = count+ 1;
	        return count;
	      }
	      for(int i = 0; i<root.children.size(); i++){
	        count= leafNodes(root.children.get(i), count);
	      }
	     return count;
	  }
	 static void replacewithDepth(GenericTreeNode<Integer> root,int depth){
		 root.data = depth;
		 for(int i=0; i<root.children.size(); i++){
			 replacewithDepth(root.children.get(i),depth+1);
		 }
	 }
	 static GenericTreeNode<Integer> findNextLargerNode(GenericTreeNode<Integer> root, int n){
	 GenericTreeNode<Integer> ans = null;
     if(root.data.compareTo(n)>0){
       ans  = root;
     }
     for(int i=0; i<root.children.size(); i++){
       GenericTreeNode<Integer> temp = findNextLargerNode(root.children.get(i), n);
       if(temp.data< ans.data){
         ans = temp;
       }
     }
     return ans;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 GenericTreeNode<Integer>root = createTree();
		// replacewithDepth(root,0);
		 GenericTreeNode<Integer> temp =findNextLargerNode(root,10);
		// printTree(root);
		// int ans = leafNodes(root, 0);
		 System.out.print(temp.data);
		 
	}

}
