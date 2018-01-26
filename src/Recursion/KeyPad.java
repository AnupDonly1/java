package Recursion;

public class KeyPad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a= Keypad(678);
	//	String b = Gatecode(5);
		for(int i =0; i<a.length; i++){
		   System.out.println(a[i]);
		}
	}
	static String  Gatecode(int i){
		String s="";
		if(i==2){
			s= s+"ABC";
			return s;
		}
		if(i==3){
			s= s+"DEF";
			return s;
		}
		if(i==4){
			s=s+"GHI";
			return s;
		}
		if(i==5){
			s+="JKL";
			return s;
		}
		if(i==6){
			s+="MNO";
			return s;
		}
		if(i==7){
			s+="PQRS";
			return s;
		}
		if(i==8){
			s+="TUV";
			return s;
		}
		if(i==9){
			s+="WXYZ";
			return s;
		}
		return s;
	}
   static String[] Keypad(int num){
	   if(num==0){
		  String[] a = {""};
		  return a;
	   }
	   String[] smallans= Keypad(num/10);
	   String code = Gatecode(num%10);
	   String[] ans= new String[smallans.length*code.length()];
	   int k=0;
	   for(int i=0; i<code.length(); i++){
		   for(int j=0; j<smallans.length; j++){
			   ans[k]= smallans[j]+ code.charAt(i);
			   k++;
		   }
	   }
	   return ans;
   }
}
