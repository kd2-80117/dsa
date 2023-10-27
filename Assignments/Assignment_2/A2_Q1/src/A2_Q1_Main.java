import java.util.Arrays;

public class A2_Q1_Main {
static int selectionSort(int [] arr, int n) {
	int comparisonCount = 0;
	for (int i = 0; i < n-1; i++) {
		
		for (int j = i+1; j < n; j++) {
			comparisonCount++;
			if(arr[i]>arr[j]) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	return comparisonCount;
}
	public static void main(String[] args) {
		int [] arr = {4,67,3,34,9};
		System.out.println("Before Selection Sort = "+Arrays.toString(arr));
		int count = selectionSort(arr, arr.length);
		System.out.println("After Selection Sort = "+Arrays.toString(arr));
		System.out.println("Number of Comparison = "+count);

	}

}
