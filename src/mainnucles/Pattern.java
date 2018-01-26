package mainnucles;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,i, a=1,n;
		Scanner s=new Scanner(System.in);
	    n=s.nextInt();
		r=1;
		while(r<=n){
			i=1;
			while(i<=r){
		     System.out.print(a);
		     a=a+1;
		     i=i+1;
		     }
	    System.out.println();
			r=r+1;
		}
		

	}

}
