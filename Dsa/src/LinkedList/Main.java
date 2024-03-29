package LinkedList;

class Node{
	static Node head=null;
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
	public static void traverse() {
		System.out.println("Traversing.....");
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}//done
	public static void insertAtBegin(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		else {
			newNode.next=head;
			head=newNode;
		}
	}
	public static void insertAtEnd(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head= newNode;
			return ;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
	}
	public static void deleteAtPos(int i) {
		if(i==0) {
			head=head.next;
			return ;
		}
		Node temp=head;
		while(--i>0) {
			temp=temp.next;
			
		}
		temp.next=temp.next.next;
	}
}
public class Main {
	public static void main(String[] args) {
		Node.insertAtBegin(10);
		Node.insertAtEnd(5);
		Node.insertAtEnd(20);
		Node.traverse(); 
		Node.deleteAtPos(2);
		Node.traverse();
	}

}
