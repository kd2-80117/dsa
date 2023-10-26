
public class A1_Q3_Main {
	public static int binarySearch(int[] arr, int size, int key) {
		int left = 0;
		int right = size - 1, mid;
		while (left <= right) {
			mid = (left + right) / 2;
			if (arr[mid] == key)
				return mid;
			else if (arr[mid] > key)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return -1;
	}

	
	public static void main(String[] args) {
		int arr[] = { 99,78,56,44,33,22,11 };
	
		int index = binarySearch(arr, arr.length, 11);
		
		
		if (index > -1)
			System.out.println("Element found at index " + index);
		else
			System.out.println("Element not found");
	}
}
