
public class A5_Q1_Main {
	public static void main(String[] args) {
		DoublyCircularLinkedList l1 = new DoublyCircularLinkedList();
		
		l1.addFirst(40);
		l1.addFirst(30);
		l1.addFirst(20);
		l1.addFirst(10);
		System.out.println("Before Delete:");
		l1.fDisplay();
		l1.deletePos(1);
		System.out.println("After Delete:");
		l1.fDisplay();

		//l1.addPos(1, 6);
		//l1.fDisplay();
		//l1.rDisplay();

	}
}
