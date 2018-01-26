package Lect4Array;
import java.util.Scanner;
public class LinearSearch {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int []arr = new int[n];
		construct(arr);
		int m = s.nextInt();
		findindex(arr,m);
		//System.out.println(l);
	}
	static void construct(int []a){
		Scanner k = new Scanner(System.in);
		for(int i=0; i<a.length ;i++){
			a[i]  = k.nextInt();
		}
	}
	static void findindex(int []b,int k){
        for(int i = 0; i<b.length ; i++){
			if( b[i] == k ){
				System.out.println(i);
		    } 
        }
	                System.out.println("-1");
    }
}