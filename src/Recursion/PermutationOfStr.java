package Recursion;

public class PermutationOfStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="abc";
		String[] b = permutation(a);
		for(int i=0; i<b.length; i++){
			System.out.println(b[i]);  
		}

	}
 static String[] permutation(String input){
	 if(input.length()==0){
		 String[] a= {""};
		 return a;
	 }
	 String[] smallans = permutation( input.substring(1) );
	 String[] ans= new String[smallans.length*(smallans[0].length()+1)];
	 int k=0;
	 for(int i=0; i<smallans.length; i++){
		 for(int j=0; j<=smallans[0].length(); j++){
			 ans[k++]= smallans[i].substring(0,j)+input.charAt(0)+smallans[i].substring(j);
		 }
    }
return ans;
 }
}