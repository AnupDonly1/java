package Lect4Array;

public class QuickSort {
	static void fun(int a[], int start, int end) {
		if(start<end) {
		int pi = partitoin(a,start,end);
		fun(a, start,pi-1);
		fun(a, pi+1, end);
		}
	}
   static int partitoin(int[] a, int start, int end) {
		// TODO Auto-generated method stub
		int pivot = a[end];
		int i = start -1;
			for(int j=start; j<end; j++) {
				if(a[j]<pivot) {
					i++;
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			int temp = a[i+1];
			a[i+1] = a[end];
			a[end] = temp;
		return (i+1);
	}

}
