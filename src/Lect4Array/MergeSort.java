package Lect4Array;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] b = {1,2,4,6,6,9};
		int [] a = {1,3,5,7,8};
	
		int[] c = mergeSorts(a,b);
		int k=0;
		while(k<c.length){
			System.out.print(c[k++]+" ");
		} 
		

	}
	static int [] mergeSorts(int[] arr1, int[] arr2){
		int i=0;
		 int j=0;
		 int k=0;
		 int []ans = new int[arr1.length+arr2.length];
		while(i<arr1.length && j<arr2.length){
			if(arr1[i]<=arr2[j]){
				ans[k++] =arr1[i++]; 
			} else {
				ans[k++] = arr2[j++];
			}
		}
		while(i<arr1.length ){
			ans[k++] = arr1[i++];
		}
		while( j<arr2.length){
			ans[k++] = arr2[j++];
		}
		return ans;
	}


}
