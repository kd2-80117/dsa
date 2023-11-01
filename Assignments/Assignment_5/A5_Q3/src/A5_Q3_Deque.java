import java.util.Scanner;

public class A5_Q3_Deque {

	public static class Deque {
		DoublyLinearLinkedList l1;

		public Deque() {
			l1 = new DoublyLinearLinkedList();
		}

		public void addFront(int value) {
			l1.addFirst(value);
		}

		public void addRear(int value) {
			l1.addLast(value);
		}

		public boolean isEmpty() {
			return l1.isEmpty();
		}

		public void deleteFront() {
			if(isEmpty())return;
			l1.deleteFirst();
		}

		public void deleteRear() {
			if(isEmpty())return;
			l1.deleteLast();
		}
		public int peekFront() {
			return l1.getHeadData();
		}
		public int peekRear() {
			return l1.getTailData();
		}
		public void fDisplay() {
			l1.fDisplay();
		}
		public void rDisplay() {
			l1.rDisplay();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Deque dq = new Deque();

		int choice = 1;
		while (choice != 0) {
			System.out.print("Menu\n1.Push Front\n2.Push Rear\n3.Pop Front\n4.Pop Rear\n5.Peek Front\n6.Peek Rear\n7.Forward Display\n8.Reverse Display\nEnter your choice = ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:

				System.out.print("Enter element = ");
				int ele = sc.nextInt();
				dq.addFront(ele);
				break;
			case 2:
				System.out.print("Enter element = ");
				int elem = sc.nextInt();
				dq.addRear(elem);
				break;
			case 3:
				dq.deleteFront();

				break;
			case 4:
				dq.deleteRear();

				break;
			case 5:
				System.out.println("Peek Front element = " + dq.peekFront());
				break;
			case 6:
				System.out.println("Peek Rear element = " + dq.peekRear());
				break;
			case 7:
				dq.fDisplay();

				break;
			case 8:
				dq.rDisplay();

				break;

			default:
				break;
			}
		}
		sc.close();
	}
}
