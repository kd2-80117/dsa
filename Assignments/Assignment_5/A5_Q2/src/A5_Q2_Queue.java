import java.util.Scanner;

public class A5_Q2_Queue {
	public static class Queue {
		SinglyLinearLinkedList l1;

		public Queue() {
			l1 = new SinglyLinearLinkedList();

		}

		public boolean isEmpty() {
			return l1.isEmpty();
		}

		public void push(int value) {
		
			l1.addLast(value);
		}

		public void pop() {
			l1.delFirst();
		}

		public int peek() {
			return l1.getData();
		}
	}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Queue q = new Queue();
	
	int choice =1;
	while (choice!=0) {
		System.out.print("Menu\n1.Offer(push)\n2.Poll(pop)\n3.Peek\nEnter your choice = ");
		 choice = sc.nextInt();
		switch (choice) {
		case 1:
		
			System.out.print("Enter element = ");
			int ele = sc.nextInt();
			q.push(ele);
			break;
			
		case 2:
			q.pop();
			
			break;
		case 3:System.out.println("Peek element = "+q.peek());
	
			break;
			
		default:
			break;
		}
	}
	sc.close();
	}
}

