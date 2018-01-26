package Recursion;

public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "1811";
		int b = convertStringToInt(a);
		System.out.print(b);

	}
	public static int convertStringToInt(String input){
		// Write your code here
      if(input.length()==1){
        int a = (int)input.charAt(0)-48;
        return a;
      }
      int smallans= convertStringToInt(input.substring(1));
      int b = (int)Math.pow(10, input.length()-1);
      int ans = ((int)input.charAt(0)- 48)*b+ smallans;
      return ans;

	}

}
