package linkListNode;

public class LinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = CreatLinkedList.PrepareLinkedList();
        Node<Integer> t = bubboleSort.BubbleSort(head);
		//Node<Integer> t = SwapTwoNode.swap(head, 2,5 );
		//Node<Integer> Temp = EvenAfterOdd.oddEven(head);
		//Node<Integer > t = TakeMremoveN.takeMremoveN(head, 2, 1);
		/*Node< Integer> Pre = null;
		Node<Integer> tail  = ReverseLinkedlist.Reverse(head, Pre) ;
		//CreatLinkedList.PrintLinkedList(tail);*/
		///Node<Integer> t = Rearrange0N1N.rearrange(head);
		CreatLinkedList.PrintLinkedList(t);
	//	Node<Integer> teap = ReverseLinkedlist.ReverseRec(head);
		//CreatLinkedList.PrintLinkedList(teap);

	}

}
