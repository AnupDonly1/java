package linkListNode;

public class TakeMremoveN {
	static Node<Integer > takeMremoveN(Node<Integer> head, int M, int N){
		
		  Node< Integer> temp = head;
		  if(temp == null){
			  return temp;
		  }
		  int m= 1;
		  int n =1;
		  while(temp!= null && m< M){
			  temp = temp.next;
			  m++;
		  }
		  if(temp == null){
			  return head;
		  } else {
			  Node<Integer> newnode = temp.next;
			  while(newnode!=null && n<N){
				  newnode= newnode.next;
				  n++;
			  }
			  if(newnode == null){
				  return head;
			  } else{
				  temp.next = takeMremoveN(newnode.next,M,N);
			  }
		  }
		  return head;
	}

}
