
public class A4_Q2_Main {
	public static void main(String[] args) {
		SinglyCircularLinkedList l1 = new SinglyCircularLinkedList();

	
		
		l1.addFirst('a');
		l1.addFirst('e');
		l1.addFirst('b');
		l1.addLast('m');
		System.out.println("Before delete");
		l1.display();
		l1.deleteFirst();
		System.out.println("After delete");
		l1.display();
		
		l1.addFirst('s');
		l1.addFirst('u');
		l1.addFirst('n');
		//l1.addPosition('@', 1);
		// l1.deleteFirst();
		// s -> u -> n -> b -> e -> a -> m
		// l1.deleteLast();
		//l1.display();
		//l1.deletePosition(8);
		//l1.display();
		System.out.println("Node count : " + l1.getCount());

		//l1.deleteAll();
	}
}
