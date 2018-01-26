package Recursion;

public class LastIndex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {1 , 7 ,4 , 7, 8 };
        int a= LastIndexof7(arr, 0);
		System.out.println(a);
	}
	static int LastIndexof7(int[]arr,int index){
		if(arr.length == index){
			return -1;
		}
		int ans = LastIndexof7(arr, index+1);
		if(arr[index]== 7 && ans==-1 ){
			return index;
		}
		return ans;
	}

}
