
public class A4_Q3_Main {
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
		l1.addLast(60);
		l1.addLast(70);
		// l1.deleteFirst();
		// 20->30->40->50
		// l1.deleteLast();
		// 20->30->40
		// l1.addPosition(60, 7);
		//l1.deletePosition(6);
		l1.display();
		
		System.out.println("Middle node = "+l1.middleNode());
		//l1.deleteAll();
	}
}
