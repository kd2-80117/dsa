
class Stack {
	int [] arr;
	int top;
	int max;
	int size;
	Stack(int size){
		this.size = size;
		arr = new int[size];
		top = -1;
		max = 0;
	}
	void push(int data) {
		if(data>max)max=data;
		arr[++top]=data;
	}
	int pop() {
		return arr[top--];
	}
	boolean isFull() {
		return top == size-1;
	}
	boolean isEmpty() {
		return top ==-1;
	}
	int max() {
		return max;
	}
	void display() {
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	Stack reverse(){

		Stack temp=new Stack(size);
		for(int i=0;i<size;i++) {
				temp.push(pop());
			
		}
		return temp;
	}
}

public class A3_Q5_Main {


public static void main(String[] args) {
	
	Stack st=new Stack(6);
	st.push(1);
	st.push(100);
	st.push(111);
	st.push(56);
	st.push(2);
	st.push(3);

	Stack st2=new Stack(6);
	System.out.println("Before Reverse: ");
	st.display();
	System.out.println("After Reverse: ");
	st2 = st.reverse();
	st2.display();

}
}

