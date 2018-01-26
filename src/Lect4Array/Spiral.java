package Lect4Array;

public class Spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a = {{1,2 ,5,10,11,18},{20,4,5,0,22,33},{30,44,55,11,12,13}};
		spiralPrint(a);

	}
	static void spiralPrint(int matrix[][]){
		// Write your code here
      int z = matrix.length/2;
     if(matrix.length %2 != 0){
      z = matrix.length/2 +1;
     }
      int j=0;
      int k=0;
      int l=0;
      int m=0;
      for(int i=0; i<z; i++){
    	
        for(  j=i; j<matrix[i].length-i; j++){
          System.out.print(matrix[i][j]+" ");
        }
        k = i+1;
        if(k<matrix.length-i){
         for( k=i+1; k<matrix.length-i; k++){
    	  System.out.print(matrix[k][j-1]+" ");
         }
         for( l=j-2; l>=i;l--){
          System.out.print(matrix[k-1][l]+" ");
         }
         for( m=k-2; m>=i+1  ;m--){
          System.out.print(matrix[m][l+1]+" ");
         }
        }
      }
        
	}

}
