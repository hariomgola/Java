package Java_Question;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Wipro_Java {
	/**
	 * Give the Employee which draws the second highest salary
	 * 
	 * @param args
	 */
	private static class employee {
		String name;
		String address;
		double salary;

		public employee(String name, String address, double salary) {
			super();
			this.name = name;
			this.address = address;
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "[name=" + name + ", address=" + address + ", salary=" + salary + "]";
		}

	}

	public static void main(String[] args) {
		List<employee> _emp = new ArrayList<employee>();
		_emp.add(new employee("emp_1", "delhi", 2000));
		_emp.add(new employee("emp_2", "delhi", 3000));
		_emp.add(new employee("emp_3", "delhi", 6000));
		_emp.add(new employee("emp_4", "delhi", 1000));

		// Main Logic over here is comparator
		_emp.stream().sorted(new Comparator<employee>() {
			@Override
			public int compare(employee e1, employee e2) {
				return (int) (e2.salary - e1.salary);
			}
		}).limit(2).skip(1).forEach(_data -> {
			System.out.println("-> " + _data.toString());
		});

	}

}
