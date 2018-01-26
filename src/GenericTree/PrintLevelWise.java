package GenericTree;

import java.util.LinkedList;

public class PrintLevelWise {
	static void printLevel(GenericTreeNode<Integer> root){
		if(root == null){
			return ;
		}
		LinkedList<GenericTreeNode<Integer>> queue = new LinkedList<>();
		queue.addLast(root);
		queue.addLast(null);
		while(!queue.isEmpty()){
			GenericTreeNode<Integer> currentNode = queue.removeFirst();
			if(currentNode == null){
				System.out.println();
				if(queue.isEmpty()){
					return;
				}
				queue.addLast(null);
			} else {
				System.out.print(currentNode.data+" ");
			
			
			if(currentNode.children.size() != 0){
				for(int i=0; i<currentNode.children.size(); i++){
					queue.addLast(currentNode.children.get(i));
				}
			}
			}
		}
		return ;
	}
	public static void main(String[] args) {
		GenericTreeNode<Integer> root = createTreeUsingQue.creattreeQue();
		printLevel(root);
	}

}
