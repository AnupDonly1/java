package Lect4Array;

public class ReverseStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = " ram was a good boy";
		String b = reverseEachWord(a);
		System.out.println(a);

	}
	public static String reverseEachWord(String input) {
		// Write your code here
      String s= "";
      String S= "";
      int i=0;
      int start = 0;
      while(i<input.length()){
        if(input.charAt(i)== ' '){
          for(int j =i-1; j>=start;j-- ){
            s= s+input.charAt(j);
          }
          S = S+s+" ";
          start = i+1;
        }
      }
      for(int j=input.length()-1; j>=start;j--){
        S = S+input.charAt(j);
      }
      return S;
	}

}
