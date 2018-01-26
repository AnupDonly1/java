package linkListNode;

public class ReverseLinkedlist {
	static Node<Integer> ReverseRec(Node<Integer> head){
		if(head.next == null){
			return head;
		}
		Node<Integer> ans  = ReverseRec(head.next);
		head.next.next = head;
		return ans;
	}
	static Node<Integer> Reverse(Node<Integer> head, Node<Integer> pre){
		Node<Integer> curr = head;
		while(curr != null){
			Node<Integer> fwd = curr.next;
			curr.next = pre;
			pre = curr;
			curr = fwd;
		}
		return pre;
	}

}
