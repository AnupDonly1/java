package LinklistPractice;


public class LinkList {
public static void main(String[] args) {
	  Node head = new Node(1);
	  head.next = new Node(2);
	  head.next.next = new Node(3);
	  head.next.next.next= new Node(4);
	  printlinklistRec(head);
	  printlinklistrev(head);
	/*  Node ans = oddEven(head);
	  while(ans!=null){
		  System.out.println(ans.data+" ");
	  }*/
	
}
 static void printlinklistRec(Node head){
	 if(head == null){
		 return ;
	 }
	 System.out.println(head.data);
	 printlinklistRec(head.next);
 }
 static void printlinklistrev(Node head){
	 if( head == null){
		 return ;
	 }
	 printlinklistrev(head.next);
	 System.out.println(head.data);
 }
/* static Node oddEven(Node head){
	 if(head == null){
		 return null;
	 }
	 Node ans  = oddEven(head.next);
	 if(head.data %2 !=0){
		 head.next = ans;
		 return head;
	 } else {
		 Node temp =ans;
		 Node pre = null;
		 while(temp.data%2!=0){
			 temp = temp.next;
			 pre.next = temp;
			 pre  =pre.next;
		 }
		 pre.next = head;
		 head.next = temp;
	 }
	 return ans;
 }*/

}
