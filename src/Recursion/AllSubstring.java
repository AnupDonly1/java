package Recursion;

public class AllSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= "abc";
		String[] b = subsequence(a);
		for(int i=0; i<b.length;i++){
			System.out.println(b[i]);
		}
		

	}
 static String[] subsequence(String input){
		// Write your code here
      if(input.length()==0){
        String[] a = {" "};
        return a;
      }
      String[] smallans = subsequence(input.substring(1));
      String[] ans = new String[smallans.length*2];
      for(int i=0; i<smallans.length; i++){
         ans[i] = smallans[i];
          ans[i+smallans.length] = input.charAt(0)+ smallans[i];
      }
      return ans;
	}
}
