package linkListNode;

public class palindrome {
	boolean isPalindrome(Node<Integer> head){
		Node< Integer > curr = head;
		Node< Integer> tail = ReverseIt(curr);
		while(head != null && tail != null){
			if( !head.data.equals(tail.data)){
				return false;
				
			}else {
				head = head.next;
				tail = tail.next ;
			}
		}
		return true;
	}
	static Node <Integer> ReverseIt(Node< Integer> head){
		//Node<Integer> curr = head;
		Node<Integer> pre = null;
		while(head!=null){
			Node<Integer> fwd = head.next; 
			head.next= pre;
			pre = head;
			head = fwd;
		}
		return pre;
	}

}
