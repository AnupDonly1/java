package Recursion;
import java.util.Scanner;

public class towerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		towerOfHanoi(n,'a','b','c');
		char a = '0';
		int b = a;
		System.out.print(b);

	}
	
	static void towerOfHanoi(int n,char s,char h , char d ){
		if(n==0){
			return;
		}
		towerOfHanoi(n-1, s,d,h);
		System.out.println("from"+ " "+s+" to"+" " + d);
		towerOfHanoi(n-1, h,s,d);
	}

}
