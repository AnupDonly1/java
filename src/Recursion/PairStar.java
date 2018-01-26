package Recursion;

public class PairStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= "hello";
		String ans = addStars(a);
		System.out.println(ans);

	}
	 static String addStars(String s) {
	      if(s.length() ==1 ){
	        return s;
	      }
			// Write your code here
	      String smallans = addStars(s.substring(1));
	      if(s.charAt(0)==smallans.charAt(0)){
	        String ans = s.charAt(0)+"*"+smallans;
	        return ans;
	      }
	      return s.charAt(0)+smallans;

		}

}
