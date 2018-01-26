package GenericTree;

public class MaxSum {
	static GenericTreeNode<Integer>  maxsum(GenericTreeNode<Integer> root){
		int max = maxSum(root);
		GenericTreeNode<Integer> ans = root;
		for(int i=0; i<root.children.size(); i++){
			GenericTreeNode<Integer> ans1 = maxsum(root.children.get(i));
			int  s  = maxSum(ans1);
			if(max<s){
				ans  = ans1;
			}
		}
		return ans;
		
	}
	static int maxSum(GenericTreeNode<Integer> root){
		int sum =0;
		for(int i=0; i<root.children.size(); i++){
			sum+= root.children.get(i).data;
		}
		return sum;
	}

}
