
public class DoublyCircularLinkedList {

	public class Node {
		private int data;
		private Node next;
		private Node prev;

		Node(int value) {
			data = value;
			next = null;
			prev = null;
		}
	}

	Node head;

	public DoublyCircularLinkedList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int value) {
		Node nn = new Node(value);
		if (isEmpty()) {
			head = nn;
			head.next = nn;
			head.prev = nn;
		} else {
			nn.next = head;
			nn.prev = head.prev;
			head.prev.next = nn;
			head.prev = nn;
			head = nn;
		}
	}

	public void addPos(int value, int pos) {
		Node nn = new Node(value);
		if (isEmpty()) {
			if (pos == 1) {
				head = nn;
				head.next = nn;
				head.prev = nn;
			}
		}else if(pos==1) {
			addFirst(value);
		}

		else {
			Node trav = head;
			do {
				trav = trav.next;
				pos--;
				if(trav==head && pos==1) {
					nn.next = trav;
					nn.prev = trav.prev;
					trav.prev.next = nn;
					trav.prev = nn;
					trav = nn;
					return;
				}
			} while (pos>1);
			nn.next = trav;
			nn.prev = trav.prev;
			trav.prev.next = nn;
			trav.prev = nn;
			trav = nn;
		}
	}
	
	public void deletePos(int pos) {
		if (isEmpty())
			return;
		else if(head.next==head) {
			head =null;
		}
		else {
			Node trav = head;
			for (int i = 1; i < pos; i++) {
				if(trav.next==head) {
					return;
				}
				trav=trav.next;
			}
			if(trav==head) {
				head.prev.next=head.next;
				head.next.prev=head.prev;
				head=head.next;
				return;
			}
			trav.prev.next = trav.next;
			trav.next.prev=trav.prev;
		}
	}

	public void fDisplay() {
		if (isEmpty())
			return;
		else {
			Node trav = head;
			System.out.println("List : ");
			do {
				System.out.print(" " + trav.data);
				trav = trav.next;
			} while (trav != head);
			System.out.println("");
		}
	}

	public void rDisplay() {
		if (isEmpty())
			return;
		else {
			Node trav = head.prev;
			System.out.println("List : ");
			do {
				System.out.print(" " + trav.data);
				trav = trav.prev;
			} while (trav != head.prev);
		}
	}

}
