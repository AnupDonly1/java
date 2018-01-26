import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int A[] = new int[n];
       int k = s.nextInt();
       int i=0,j=0;
       for(i=0;i<=n-1;i++){
    	   A[i]=s.nextInt();
       }
       int start=0;
       int last=n-1;
       int mid=(start+last)/2;
       for(int l=start; l<last ;l++){
    	   if(A[mid]<k){
    		   start=mid+1;
    	   }else if(A[mid]==k){
    		   System.out.println(k+" location is "+mid+1);
    	   }else
    		   last=mid-1;
    	   
    	   mid=(start+last)/2;
       }
	}

}
