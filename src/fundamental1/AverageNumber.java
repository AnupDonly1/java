package fundamental1;

import java.util.Scanner;
public class AverageNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        System.out.println("name");
        char name = s.next().charAt(0);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int avg = 0;
        if(a>=b && b>=c)
        	avg = (a+b)/2;
        else if(a>=c && c>=b)
        	avg= (a+c)/2;
        else 
        	avg = (b+c)/2;
        System.out.println(name+" "+avg);
	}

}
