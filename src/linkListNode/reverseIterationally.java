package linkListNode;

public class reverseIterationally {
	Node<Integer> reverseIte(Node <Integer> head){
		Node <Integer> pre = null;
		Node <Integer> curr = head;
		while( curr != null){
			Node<Integer> fwd = curr.next;
			curr .next = pre ; 
			pre = curr;
			curr = fwd ;
		}
		return pre;
	}

}
