import java.util.Arrays;

/**
 * 
 */

/**
 * @author ritupowar
 *
 */
public class A2_Q2_Main {

	static int bubbleSort(int[] arr, int n) {
		int comparisonCount = 0;
		int flag;
		for (int i = 1; i < n ; i++) {
			flag = 0;
			for (int j = 0; j < n - i; j++) {
				comparisonCount++;
				if (arr[j] > arr[j + 1]) {
					flag = 1;
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			if(flag==0) break;
		}
		return comparisonCount;
	}

	public static void main(String[] args) {
		//int[] arr = { 4, 67, 3, 34, 9 };
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println("Before Bubble Sort = " + Arrays.toString(arr));
		int count = bubbleSort(arr, arr.length);
		System.out.println("After Bubble Sort = " + Arrays.toString(arr));
		System.out.println("Number of Comparison = " + count);
	}

}
