package mainnucles;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int i=2;
		while(i<=n){
			if(n%i==0){
				System.out.println(n+" is not prime");
				return;
				
			}
			else{
				i=i+1;
			}
		}
		System.out.println(n+" is prime");

	}

}
