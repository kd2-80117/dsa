
public class A1_Q5_Main {
	static int linearSearch(int[] arr, int key, int a) {
		for (int i = 0; i < arr.length; i++) {
			if(i==a) {
				continue;
			}
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };

		for (int i = 0; i < arr.length; i++) {

			int found = linearSearch(arr, arr[i],i);
			System.out.println("hello");
			if (found == -1) {
				System.out.println("Non repeating element = " + arr[i]);
				break;
			}

		}
	}

}
