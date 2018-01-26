 package linkListNode;

public class SwapTwoNode {
	static Node<Integer> swap(Node<Integer> head, int k, int l){
	  Node<Integer> temp = head, pre1  = null, pre2  = null, fwd1 = temp.next,fwd2 = temp.next;
	  Node< Integer> curr_I = temp, curr_J = temp;
	  int i = k, j = l;
	  
      while(i>0 && j>0){
    	  pre1  = temp ;
    	  temp = temp.next;
    	  fwd1 = temp.next;
    	  i--;
    	  j--;
      }
      if(i == 0){
    	  curr_I = temp;
    	  while(j>0 && temp.next!= null){
    		  pre2 = temp ;
    		  temp = temp.next;
    		  fwd2 = temp.next;
    	  }
    	  curr_J = temp;
      } else {
    	  curr_J = temp;
    	  pre2 = pre1;
    	  fwd2 = fwd1;
    	  while(i>0 && temp.next!= null){
    		  pre1 = temp;
    		  temp = temp.next;
    		  fwd1 =temp.next;
    	  }
    	  curr_I = temp;
      } 
      if(k == 0 ){
    	  pre2.next = curr_I;
    	  curr_I.next = fwd2;
    	  curr_J.next = fwd1;
    	  return curr_J;
      } else {
    	  if(l == 0){
    		  pre1.next = curr_J;
    		  curr_J.next = fwd1;
    		  curr_I.next = fwd2;
    		  return curr_I;
    	  } else {
    		  pre1.next = curr_J;
    		  curr_J.next = fwd1;
    		  pre2.next = curr_I;
    		  curr_I.next = fwd2;
    		  return head;
    	  }
      }
	}
	

}
