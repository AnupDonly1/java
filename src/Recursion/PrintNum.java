package Recursion;
import java.util.Scanner;

public class PrintNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		printup(n);
		System.out.println();
		printdown(n);

	}
	 static void printup(int n){
			if(n == 1){
				System.out.print( n+" ");
				return ;
			}
			printup(n - 1);
	      System.out.print(n+" ");
		}

	 static void printdown(int n){
			if(n == 1){
				System.out.print( n+" ");
				return ;
			}
			
	      System.out.print(n+" ");
	      printdown(n - 1);
		}
}
