package Tree;
class Tree{
	int data;
	Tree left;
	Tree right;
	Tree(int data){
		this.data=data;
	}
	public static void traverse(Tree head) {
		if(head==null)
			return;
		else {
			
			traverse(head.left);
			System.out.println(head.data);
			traverse(head.right);
			
		}
		
	}
	
}
public class Main {

	public static void main(String[] args) {
		Tree t1=new Tree(10);
		Tree t2=new Tree(20);
		Tree t3=new Tree(30);
		Tree t4=new Tree(40);
		Tree t5=new Tree(50);
		Tree t6=new Tree(60);
		Tree t7=new Tree(70);
		t1.left=t2;
		t1.right=t3;
		t2.left=t4;
		t2.right=t5;
		t3.left=t6;
		t3.right=t7;
		
		
		
		Tree.traverse(t1);
		
	}

}
