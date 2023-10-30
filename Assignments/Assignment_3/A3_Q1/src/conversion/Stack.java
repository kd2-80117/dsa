package conversion;

public class Stack {
	int top;
	char arr[];
	final int SIZE;

	public Stack(int size) {
		this.SIZE = size;
		arr = new char[SIZE];
		top = -1;
	}

	public void push(char data) {
		top++;
		arr[top] = data;
	}

	public char pop() {
		char data = arr[top];
		top--;
		return data;
	}

	public char peek() {
		return arr[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == SIZE - 1;
	}

}
