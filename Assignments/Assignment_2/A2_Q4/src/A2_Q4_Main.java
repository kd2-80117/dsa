

import java.util.Arrays;

/**
 * @author ritupowar
 *
 */
public class A2_Q4_Main {

	static int insertionSort(int[] arr, int n) {
		int comparisonCount = 0;
		int temp,j;
		for (int i = 1; i < n; i++) {
			temp = arr[i];
			j = i - 1;
			while (j>=0 && arr[j] < temp) {
				comparisonCount++;
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		return comparisonCount;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 67, 3, 34, 9 };
		// int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println("Before Insertion Sort = " + Arrays.toString(arr));
		int count = insertionSort(arr, arr.length);
		System.out.println("After Insertion Sort in Desc order = " + Arrays.toString(arr));
		System.out.println("Number of Comparison = " + count);
	}

}
