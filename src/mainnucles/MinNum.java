package mainnucles;

import java.util.Scanner;

public class MinNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		int min=Integer.MAX_VALUE;
	
		while(i<=n){
			a=s.nextInt();
			if(a<=min){
				min=a;
				i=i+1;
			}
			else{
				i=i+1;
				
			}
		
			
		}
		System.out.println("min is :"+min);
		

	}

}
