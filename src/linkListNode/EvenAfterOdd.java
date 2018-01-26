package linkListNode;

public class EvenAfterOdd {
	static Node<Integer> oddEven(Node< Integer> head){
		if(head == null){
			return head;
		}
		Node<Integer> evenHead = null, evenTail = null, OddHead = null, OddTail= null;
		while(head != null){
			if(head.data % 2 == 0){
				if(evenHead == null){
					evenHead = head;
					evenTail = head; 
				} else {
					evenTail.next = head; 
					evenTail = evenTail.next;
				}
			} else{
				if(OddHead == null){
					OddHead = head;
					OddTail= head;
				} else {
					OddTail.next = head;
					OddTail = OddTail.next;
				}
			}
			head = head.next;
		}
		if(OddHead == null){
			return evenHead;
		} else{
			OddTail.next = evenHead;
			evenTail.next = null;
		}
		return OddHead;
	}

}
