
public class SinglyCircularLinkedList {
	public class Node {
		private char data;
		private Node next;

		public Node(char value) {
			data = value;
			next = null;
		}
	}

	private Node tail;
	private int count;

	public SinglyCircularLinkedList() {
		tail = null;
		count = 0;
	}

	public int getCount() {
		return count;
	}

	public boolean isEmpty() {
		return count == 0;
	}

	public void display() {
		if (isEmpty())
			System.out.println("List is empty");
		else {
			Node trav = tail.next;
			System.out.print("List : ");
			do {
				System.out.print(" " + trav.data);
				trav = trav.next;
			} while (trav != tail);
			System.out.println(" "+trav.data);
			System.out.println();
		}
	}

	public void deleteAll() {
		tail = null;
	}

	public void addFirst(char value) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			tail = newNode;
			newNode.next = newNode;
		} else {
			newNode.next = tail.next;
			tail.next = newNode;

		}
		count++;
	}

	public void addLast(char value) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			tail = newNode;
			newNode.next = newNode;
		} else {
			newNode.next = tail.next;
			tail.next = newNode;
			tail = newNode;
		}
		count++;
	}

	public void deleteFirst() {
		if(isEmpty()) System.out.println("List is empty");
		else {
			tail.next = tail.next.next;
		}
	}
	
}
