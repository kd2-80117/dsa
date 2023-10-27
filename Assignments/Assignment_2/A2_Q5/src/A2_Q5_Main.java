import java.util.ArrayList;

public class A2_Q5_Main {

	static void salarySort(ArrayList<Employee> arr, int n) {
		int flag;
		for (int i = 1; i < n; i++) {
			flag = 0;
			for (int j = 0; j < n - i; j++) {
				flag = 1;
				if (arr.get(j).getSalary() > arr.get(j+1).getSalary()) {
					flag = 1;
					
					Employee temp = arr.get(j);
					arr.set(j, arr.get(j+1));
					arr.set(j+1, temp);
					
				}
			}
			if(flag ==0) break;
		}

	}

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "Ujjwal", 9078653.0));
		list.add(new Employee(2, "Princy", 907.0));
		list.add(new Employee(3, "Ritu", 1078657.0));
		list.add(new Employee(4, "Vijay", 90.0));
		list.add(new Employee(5, "Rudra",86.0));
		list.add(new Employee(6, "Viraj", 9053.0));
		list.add(new Employee(7, "Sumit", 1233.0));
		list.add(new Employee(8, "Anuj", 412.0));
		list.add(new Employee(9, "Sarthak", 212.0));
		System.out.println("Before Sort = ");
		for (Employee employee : list) {
			System.out.println(employee);
		}
		
		salarySort(list, list.size());
		System.out.println("After Sort = ");
		for (Employee employee : list) {
			System.out.println(employee);
		}
	
		
			
		
	}
}
