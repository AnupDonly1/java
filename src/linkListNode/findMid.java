package linkListNode;

public class findMid {
	public int findmid( Node<Integer> head){
		
	 Node<Integer> slow =head ;
	 Node<Integer> fast = head.next.next;
	 if(head!=null){
	   while(fast != null && fast.next != null){
		 fast = fast.next.next;
		 slow = slow.next;
	   }
	 }
	 return slow.data; 
	}
	

}
