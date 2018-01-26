package linkListNode;

import java.util.Scanner;

public class CreatLinkedList{

	private static Scanner s;
	static Node<Integer> PrepareLinkedList(){
		s = new Scanner(System.in);
		Node<Integer> head = null;
		Node<Integer> tail = null;
		int data = s.nextInt();
		if(data == -1){
			return null; 
		} else {
			head = new Node<>(data);
			tail = head;
		}
		data = s.nextInt();
		while(data !=-1){
			Node<Integer> nyaNode = new Node<>(data);
			tail.next =nyaNode;
			tail = tail.next;
			data = s.nextInt();
		}
		return head;
	}
	static <T>void PrintLinkedList(Node<T> head){
		while(head!=null){
		System.out.print(head.data+" ");
		head = head.next;
		}
	}
	
	static <T>void PrintRec(Node<T> head){
		if(head == null){
			return;
		}
		System.out.print(head.data+" ");
		PrintRec(head.next);
	}

}
