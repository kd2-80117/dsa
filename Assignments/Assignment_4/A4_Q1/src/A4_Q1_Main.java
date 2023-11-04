
public class A4_Q1_Main {

	public static void main(String[] args) {
		SinglyLinearLinkedList l1 = new SinglyLinearLinkedList();

		l1.addFirst(40);
		// 40
		l1.addFirst(30);
		// 30->40
		l1.addFirst(20);
		// 20->30->40
		l1.addFirst(10);
		// 10->20->30->40
		l1.addLast(50);
		// 10->20->30->40->50
		 l1.delFirst();
		// 20->30->40->50
		l1.delLast();
		// 20->30->40
		
		l1.display();

	}

}
