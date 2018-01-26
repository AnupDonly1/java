package Recursion;

public class FindMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= new int[]{1, 3 , 6 , 7,0};
		int b = minarr(a,0);
      System.out.print(b);
	}
	static int minarr(int []arr,int  index){
		if(arr.length-1==index){
			return arr[index];
		}
		int ans= minarr(arr , index+1);
		if(arr[index]<=ans){
			return arr[index];
		}
		return ans;
	}

}
