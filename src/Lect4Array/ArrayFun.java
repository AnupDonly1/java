package Lect4Array;

import java.util.Scanner;

public class ArrayFun {

 static Scanner s  = new Scanner(System.in); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter size ");
		int n = s.nextInt();
         int []arr = new int[n];
         construct(arr);
          QuickSort.fun(arr, 0, n-1);
         // arr = BubbleSort.fun(arr);
        // int[] ans = InsertionSort.fun(arr, arr.length);
        // int ans = SelectionSort.min(arr, 0);
        printArray(arr);
        
  
	}
	static void swap(int i, int j) {
		int temp = i;
		i = j;
		j = temp;
	}
	static void printArray(int a[]) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	    static void construct(int []a){
	    // s = new Scanner(System.in);
	    	for(int i=0; i<a.length; i++){
	    		
	    		a[i]= s.nextInt();
	    		}
	    }
        static void largest(int []b){
        	int largest = Integer.MIN_VALUE ;
        
        	
           for(int i = 0; i<b.length ; i++){
        	
        	  if(b[i]>=largest){
        		int temp = b[i];
        		b[i] = largest;
        		largest = temp ;
        	  }
           }
           System.out.println(largest);
        }
        static void smallest(int []b){
        	int  minmum = Integer.MAX_VALUE ;
            for(int i =0; i<b.length;i++){
        	    if(b[i]<=minmum){
        		  int temp = b[i];
        		  b[i] = minmum ;
        		  minmum = temp ;	
        	}
        }
       
        System.out.println(minmum);
	}
        
} 


