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
	}
	
public class A3_Q2_Main {

	
	public static void main(String[] args) {
		
		Stack st=new Stack(5);
		st.push(1);
		st.push(100);
		st.push(111);
		st.push(56);
		st.push(2);
	
		System.out.println("Maximum Element = "+st.max());
	}
}
