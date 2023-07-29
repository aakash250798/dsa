package LinkedList;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
	public static void traverse(Node n1) {
		Node temp=n1;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
}
public class Main {
	public static void main(String[] args) {
		
		Node n1=new Node(5);
		Node n2=new Node(10);
		Node n3=new Node(15);
		Node n4=new Node(20);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		Node.traverse(n1);
	}

}
