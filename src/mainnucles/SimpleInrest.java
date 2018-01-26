package mainnucles;

import java.util.Scanner;

public class SimpleInrest {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter p: ");
		int p=s.nextInt();
		System.out.println("enter r: ");
		int r=s.nextInt();
		System.err.println("enter t: ");
		int t=s.nextInt();
		double si=(p*r*t)/100.0;
		System.out.println("simple Interest; "+si);
				
	}

}
