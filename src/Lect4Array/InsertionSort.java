package Lect4Array;

public class InsertionSort {
	static int[] fun(int a[], int size) {
		for(int i=1; i<size; i++) {
			int key = a[i];
			int j = i-1;
			while(j>=0 && a[j]>key) {
				a[j+1] = a[j];
				j = j-1;
			}
			a[j+1] = key; 
		}
		return a;
	}
	public static void main(String[] args) {
		
	}
}
