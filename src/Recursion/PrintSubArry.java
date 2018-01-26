package Recursion;

public class PrintSubArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3};
		int[]b = {};
		
		printsubarr(a,b,0);

	}
	static void printsubarr( int[] a, int[] b,int index){
		if(index == a.length){
			System.out.println(b);
			return;
		}
		printsubarr(a,b,index+1);
		b[b.length] = a[index];
	     b = new int[b.length+1];
	     printsubarr(a,b, index+1);
	 	b[b.length] = a[index];
	     
	}

}
