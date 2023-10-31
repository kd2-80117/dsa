import java.util.Scanner;

public class A5_Q2_Main {
	public static class Stack {
		SinglyLinearLinkedList l1;

		public Stack() {
			l1 = new SinglyLinearLinkedList();

		}

		public boolean isEmpty() {
			return l1.isEmpty();
		}

		public void push(int value) {
		
			l1.addFirst(value);
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
	Stack st = new Stack();
	
	int choice =1;
	while (choice!=0) {
		System.out.println("Menu\n1.Push\n2.Pop\n3.Peek\nEnter your choice = ");
		 choice = sc.nextInt();
		switch (choice) {
		case 1:
		
			System.out.print("Enter element = ");
			int ele = sc.nextInt();
			st.push(ele);
			break;
			
		case 2:
			st.pop();
			
			break;
		case 3:System.out.println("Peek element = "+st.peek());
	
			break;
			
		default:
			break;
		}
	}
	sc.close();
	}
}
