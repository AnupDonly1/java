package Lect4Array;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  	int [][]a = {{2, 3,10},{5,6,7},{1,2,9}};
		  	findLargest(a);
	}
		   static void findLargest(int input[][]){
				
		      int sum1 =0; 
		      int sum2 = 0;
		      int row=0; 
		      int col =0;
		      for(int i=0; i<input.length; i++){
		        int sum =0;
		        for(int j=0;j<input[i].length;j++){
		          sum += input[i][j];
		        }
		        if(sum>sum1){
		          sum1= sum;
		          row= i;
		        }
		      }
		      for(int i=0; i<input[0].length; i++){
		          int sum=0;
		          for(int j=0; j<input.length; j++){
		            sum += input[j][i];
		          }
		          if(sum > sum2){
		            sum2 =sum;
		            col = i;
		          }
		       }
		        if(sum1 > sum2){
		          System.out.println("row "+row+" "+sum1);
		        } else {
		          System.out.println("column "+col+" "+sum2);
		        }
		  	}


}
