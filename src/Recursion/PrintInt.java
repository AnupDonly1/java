package Recursion;

public class PrintInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print(6);
		int a = count(1234);
		System.out.println(a);
		int ans = power(2,a);
		System.out.println(ans);
		int ar[]= new int[]{ 1 ,2 ,3 ,4};
		System.out.println(sum1(ar, 0));
		print(a);
	}

 static void print(int n){
		if(n == 1){
			System.out.print( n+" ");
			return ;
		}
		print(n - 1);
      System.out.print(n+" ");
	}
 static int count(int n){
		if(n/10 == 0){
			return 1;
		}
		int smallAns = count(n / 10);
		return smallAns + 1;
	}
 static int power(int x, int n) {
     if(n==0){
       return 1;
     }
	  return x*power(x,n-1);
	}
 static int sum1(int []a,int i){
	    if(i==a.length){
	      return 0;
	    }
	    return a[i]+sum1(a,i+1);
	  }

}
