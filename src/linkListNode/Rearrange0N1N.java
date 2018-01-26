package linkListNode;

public class Rearrange0N1N {
	static Node<Integer>  rearrange(Node<Integer> head){
	Node< Integer> temp = head, tmp1  = head ;
	 Node<Integer> tail=ReverseLinkedlist.ReverseRec(temp);
	while(tmp1!= null && tail!= null) {
		Node<Integer> fwd = tmp1.next;
		Node<Integer> fwd1 = tail.next;
		tmp1.next= tail;
		tmp1 = fwd;
		tail.next = fwd;
		tail = fwd1;
	}
	return head;
	}

}
