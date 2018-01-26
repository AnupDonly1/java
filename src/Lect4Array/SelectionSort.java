package Lect4Array;

public class SelectionSort {
	static int[] fun(int a[]) {
		for(int i=0; i<a.length; i++) {
			int minInd = min(a, i);
			//swap(a[i],a[minInd]);
			int temp = a[i];
			a[i] = a[minInd];
			a[minInd] = temp;
		}
		return a;
	}
	 static void swap(int i, int j) {
		// TODO Auto-generated method stub
		 int temp = i;
			i = j;
			j = temp;
		 
	}
	static int 	min(int a[], int start){
		int m = a[start];
		int ind = start;
		for( int i=start+1; i<a.length; i++) {
			if( a[i]< m) {
				m = a[i];
				ind = i;
			}
		}
		return ind;
	}
}
