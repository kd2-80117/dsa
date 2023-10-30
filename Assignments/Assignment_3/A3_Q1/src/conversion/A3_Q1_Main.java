package conversion;

public class A3_Q1_Main {

	public static int prio(char opr) {
		switch (opr) {
		case '$':
			return 3;
		case '/':
			return 2;
		case '*':
			return 2;
		case '%':
			return 2;
		case '+':
			return 1;
		case '-':
			return 1;
		}
		return 0;
	}

	public static String singleDigitInfixToPostfix(String infix) {
		Stack st = new Stack(20);
		StringBuilder postfix = new StringBuilder();
		for (int i = 0; i < infix.length(); i++) {
			char ele = infix.charAt(i);
			if (Character.isDigit(ele))
				postfix.append(ele);
			else if (ele == '(')
				st.push(ele);
			else if (ele == ')') {
				while (st.peek() == '(') {
					postfix.append(st.pop());
				}
				st.pop();
			} else {
				while (!st.isEmpty() && prio(st.peek()) >= prio(ele)) {
					postfix.append(st.pop());
				}
				st.push(ele);
			}
		}
		while (!st.isEmpty()) {
			postfix.append(st.pop());
		}
		return postfix.toString();
	}

	public static String multiDigitInfixToPostfix(String infix) {
		Stack st = new Stack(20);
		String[] str;
		str = infix.split(",");
		StringBuilder postfix = new StringBuilder();
		for (int i = 0; i < str.length; i++) {
			String ele = str[i];
		
				int number = Integer.valueOf(ele);
				postfix.append(number);
			
				//int op2 = st.pop();
				//int op1 = st.pop();
				// char c = ele.charAt(0);
				//st.push(calculate(op1, op2, ele));
			}
//			else if (ele == '(')
//				st.push(ele);
//			else if (ele == ')') {
//				while (st.peek() == '(') {
//					postfix.append(st.pop());
//				}
//				st.pop();
//			if (Character.isDigit(ele))
//				postfix.append(ele);
//			
//			} else {
//				while (!st.isEmpty() && prio(st.peek()) >= prio(ele)) {
//					postfix.append(st.pop());
//				}
//				st.push(ele);
//			}
//		}
//		while (!st.isEmpty()) {
//			postfix.append(st.pop());
//		}
		return postfix.toString();
	}
	
	public static String singleDigitInfixToPrefix(String infix) {
		Stack st = new Stack(20);
		StringBuilder prefix = new StringBuilder();
		for (int i = infix.length()-1; i >=0 ; i--) {
			char ele = infix.charAt(i);
			if (Character.isDigit(ele))
				prefix.append(ele);
			else if (ele == ')')
				st.push(ele);
			else if (ele == '(') {
				while (st.peek() != ')') {
					prefix.append(st.pop());
				}
				st.pop();
			} else {
				while (!st.isEmpty() && prio(st.peek()) > prio(ele)) {
					prefix.append(st.pop());
				}
				st.push(ele);
			}
		}
		while (!st.isEmpty()) {
			prefix.append(st.pop());
		}
		prefix.reverse();
		return prefix.toString();
	}
	
	public static void main(String[] args) {

		String infix = "1$9+3*4-(6+8/2)+7";

		System.out.println("Infix : " + infix);
		String postfix = singleDigitInfixToPostfix(infix);
		System.out.println("Postfix : " + postfix);
		String prefix = singleDigitInfixToPrefix(infix);
		System.out.println("Prefix : " + prefix);

	}
}
