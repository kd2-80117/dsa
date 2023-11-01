
public class DoublyLinearLinkedList {
	public class Node {
		private int data;
		private Node next;
		private Node prev;

		public Node(int value) {
			data = value;
			next = null;
			prev = null;
		}
	}

	private Node head;
	private Node tail;

	public DoublyLinearLinkedList() {
		head = tail = null;
	}
	public boolean isEmpty() {
		return head==null;
	}
	public int getHeadData() {
		return head.data;
	}
	public int getTailData() {
		return tail.data;
	}
	public void addFirst(int value) {
		Node nn = new Node(value);
		if (isEmpty())
			head = tail = nn;
		else {
			nn.next = head;
			head.prev = nn;
			head = nn;
		}
	}

	public void addLast(int value) {
		Node nn = new Node(value);
		if (isEmpty())
			head = tail = nn;
		else {
			nn.prev = tail;
			tail.next = nn;
			tail = nn;
		}
	}
	
	public void deleteFirst() {
		
		if (isEmpty())
			return;
		else if(head==tail) head = tail = null;
		else {
			head = head.next;
			head.prev = null;
		}
	}

	public void deleteLast() {
		if (isEmpty())
			return;
		else if(head==tail) head = tail = null;
		else {
			tail = tail.prev;
			tail.next = null;
		}
	}
	
	public void fDisplay() {
		if (isEmpty()) System.out.println("List is Empty");
		else {
			Node trav = head;
			System.out.print("Forward List : ");
			while(trav!=null) {
				System.out.print(" "+trav.data);
				trav=trav.next;
			}
			System.out.println("");
		}
	}
	
	public void rDisplay() {
		if (isEmpty()) System.out.println("List is Empty");
		else {
			Node trav = tail;
			System.out.print("Reverse List : ");
			while(trav!=null) {
				System.out.print(" "+trav.data);
				trav=trav.prev;
			}
			System.out.println("");
		}
	}
	
	
	
}
