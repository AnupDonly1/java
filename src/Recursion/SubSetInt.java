package Recursion;

public class SubSetInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3};
		int[][]b = subset(a,0);
		for(int i=0; i<b.length; i++){
			for(int j=0; j<b[i].length; j++){
				System.out.println(b[i][j]);
			}
		}

	}
	  static int[][] subset(int []arr, int index){
		  if(arr.length >=index){
			  int[][]ans = new int[0][0];
			  return ans;
		  }
		    int smallans[][] = subset(arr,index+1);
		      int ans[][] = new int[smallans.length* 2][];
		        for(int i=0; i<smallans.length;i++){
		        	smallans[i]= new int[smallans[i].length];
		          for(int j=0; j<smallans[i].length; j++){
		            ans[i][j] = smallans[i][j];
		          }
		          ans[smallans.length][0]=arr[0];
		          for(int j=0; j<smallans[i].length; j++){
		            ans[smallans.length+i+1][j+1] = smallans[i][j] ;
		          }
		        }
		    return ans;
		  } 

}
