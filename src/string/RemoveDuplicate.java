package string;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "aaabbbccc" ;
		String b = removeConsecutiveDuplicates(a);
		System.out.print( b);

	}
 static String removeConsecutiveDuplicates(String input) {
	    // Write your code here
      String s= "";
      for(int i=0;i<input.length()-1; i++){
        if(input.charAt(i)!=input.charAt(i+1)){
          s = s+input.charAt(i);
        } 
      }
      if(input.charAt(input.length())!= input.charAt(input.length()-1)){
       String ans=  s+input.charAt(input.length());
       return ans;
     }
      return s ;

	}

}
