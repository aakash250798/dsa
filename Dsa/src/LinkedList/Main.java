package LinkedList;

class Node{
	static Node head=null;
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
	public static void traverse() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
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
}
public class Main {
	public static void main(String[] args) {
		Node.insertAtBegin(10);
		Node.insertAtEnd(5);
		Node.insertAtEnd(20);
		Node.traverse(); 
	}

}
