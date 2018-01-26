package Lect4Array;

public class BubbleSort {
	static int[] fun(int a[]) {
		boolean swapped;
		for(int i=0; i<a.length; i++) {
			swapped = false;
			for(int j=0; j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					swapped = true;
				} 
				if(swapped == false) {
					break;
				}
			}
		}
		return a;
	}

}
