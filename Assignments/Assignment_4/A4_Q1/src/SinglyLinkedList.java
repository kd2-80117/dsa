
public class SinglyLinkedList {

	public class Node{
		private int data;
		private Node next;
		public Node(int value) {
			this.data=value;
			this.next=null;
		}
	}
	private Node head;
	private Node tail;
	public SinglyLinkedList() {
		head = null;
		tail = null;
	}
	
	public boolean isEmpty() {
		return head == null; 
	}
	
	public void addFirst(int value) {
		Node newNode = new Node(value);
		if(isEmpty()) head = tail= newNode;
		else {
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void addLast(int value) {
		Node newNode = new Node(value);
		if(isEmpty()) head = tail= newNode;
		else {
			tail.next = newNode;
			newNode.next = null;
			tail = newNode;
			
		}
	}
	
	public void delFirst() {
		if(isEmpty()) System.out.println("List is empty");
		else head = head.next;
	}
	
	public void delLast() {
		if(isEmpty()) System.out.println("List is empty");
		else if(head==tail) head = tail = null;
		else {
			Node trav = head;
			while(trav.next!=tail) 
				trav = trav.next;
			trav.next = null;
			tail = trav;
		}
	}
	
	public void display() {
		Node trav = head;
		System.out.print("List = ");
		while(trav!=null) {
			System.out.print(" "+trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
