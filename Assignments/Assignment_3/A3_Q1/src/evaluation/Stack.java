package evaluation;
public class Stack {
	int top;
	int arr[];
	final int SIZE;

	public Stack(int size) {
		this.SIZE = size;
		arr = new int[SIZE];
		top = -1;
	}

	public void push(int data) {
		top++;
		arr[top] = data;
	}

	public int pop() {
		int data = arr[top];
		top--;
		return data;
	}

	public int peek() {
		return arr[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == SIZE - 1;
	}

}
