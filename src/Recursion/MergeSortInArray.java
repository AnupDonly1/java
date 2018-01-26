package Recursion;
import java.util.Scanner;

public class MergeSortInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int []a = new int[n];
		int j=0;
		while(j<n){
			 a[j++] = s.nextInt();
		}
		int []b = SortArry(a);
		int i=0;
		while(i<n){
			System.out.print(b[i++]+" ");
		}
		

	}
	static int[] SortArry(int []a){
		if(a.length == 1){
			return a;
		}
		int[] left = new int[a.length/2];
		int []right = new int[a.length- left.length];
		for(int i=0 ; i<left.length; i++){
			left[i] = a[i];
		}
		for(int j=left.length; j<a.length; j++){
			right[j-left.length] = a[j];
		}
		int []d = SortArry(left);
		int []e = SortArry(right);
		int[] ans = mergeSorts(d,e);
		return ans;
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
