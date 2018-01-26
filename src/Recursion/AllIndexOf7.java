package Recursion;

public class AllIndexOf7 {

	public static void main(String[] args) {
		
		int []arr= {1,3,3,4,5 ,3};
		int []b= allIndex(arr,0,3);
		for(int i=0; i<b.length; i++){
	    	System.out.println(b[i]);
		}

	}
	 static int []allIndex(int[]a,int i, int x){
	     if(i == a.length){
	       int []ans=new int[0];
	       return ans;
	     }
	     int[] smallans= allIndex(a,i+1,x);
	     if(a[i]== x){
	       int []ans = new int[smallans.length+1];
	       ans[0]=i;
	       for(int j=0; j<smallans.length; j++){
	         ans[j+1]=smallans[j];
	       }
	       return ans;
	     }
	     return smallans;
	   } 

}
