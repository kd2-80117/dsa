import java.util.ArrayList;
import java.util.Scanner;

public class A1_Q2_Main {
	static int empidLinearSearch(ArrayList<Employee> arr, int key) {
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getempid() == key)
				return i;
		}
		return -1;
	}

	static int empidBinarySearch(ArrayList<Employee> arr, int key) {
		int left = 0;
		int right = arr.size() - 1;
		int mid;
		while (left <= right) {
			mid = (left + right) / 2;
			if (arr.get(mid).getempid() == key)
				return mid;
			else if (key > arr.get(mid).getempid())
				left = mid + 1;
			else
				right = mid - 1;
		}
		return -1;
	}
	
	static int nameBinarySearch(ArrayList<Employee> arr, String key) {
		int left = 0;
		int right = arr.size() - 1;
		int mid;
		while (left <= right) {
			mid = (left + right) / 2;
			if (arr.get(mid).getName().compareTo(key)==0)
				return mid;
			else if (arr.get(mid).getName().compareTo(key)<=-1)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return -1;
	}

	static Employee nameLinearSearch(ArrayList<Employee> arr, int size, String key) {
		for (Employee employee : arr) {
			if (employee.getName().compareTo(key) == 0)
				return employee;

		}
		return null;
	}

	static int salaryLinearSearch(ArrayList<Employee> arr, int size, double key) {
		for (int i = 0; i < size; i++) {
			if (arr.get(i).getSalary() == key)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> arr = new ArrayList<Employee>();

		arr.add(new Employee(1, "dev", 5000));
		arr.add(new Employee(2, "om", 3000));
		arr.add(new Employee(3, "raj", 5000));
		arr.add(new Employee(4, "raju", 3000));
		arr.add(new Employee(5, "ram", 2000));

		System.out.print("Enter empid to search = ");
		int key = sc.nextInt();
		int index = empidBinarySearch(arr, key);
		if (index > -1)
			System.out.println("Employee found at index " + index);
		else
			System.out.println("Employee not found");

		
		
		
		System.out.print("Enter emp name to linear search = ");
		String key2 = sc.next();
		Employee emp = new Employee();
		emp = nameLinearSearch(arr, arr.size(), key2);
		if (emp != null)
			System.out.println("Employee found. " + emp);
		else
			System.out.println("Employee not found");
		
		
		
		
		System.out.print("Enter emp name to binary search = ");
		String key3 = sc.next();
		int index1 = nameBinarySearch(arr, key3);
		if (index1>-1)
			System.out.println("Employee found at index " + index1);
		else
			System.out.println("Employee not found");

		
		
		
		
		System.out.print("Enter salary to search = ");
		double sal = sc.nextInt();
		int salary = salaryLinearSearch(arr, arr.size(), sal);
		if (salary > -1)
			System.out.println("Salary found at index " + salary);
		else
			System.out.println("Salary not found");

		sc.close();
	}
}
