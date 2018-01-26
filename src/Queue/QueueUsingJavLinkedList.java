package Queue;

import java.util.LinkedList;

public class QueueUsingJavLinkedList<T> {
	LinkedList<T> list ;
	public QueueUsingJavLinkedList(){
		list = new LinkedList<>();
	}
	void enqueue(T data){
		list.addLast(data);
	}
	T dequeue(){
		return list.removeFirst();
	}

}
