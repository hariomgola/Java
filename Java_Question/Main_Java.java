package Java_Question;

import java.util.Arrays;
import java.util.List;

public class Main_Java {

	public static void main(String[] args) {
		System.out.println(false);
	}

	private static class Employee {
		int employeeId;
		String firstName;
		String lastName;
		int age;
		int salary;
		Address address;

		public Employee(int employeeId, String firstName, String lastName, int age, int salary, Address address) {
			this.employeeId = employeeId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
			this.salary = salary;
			this.address = address;
		}
	}

	private static class Address {
		String city;
		String area;
		int pinCode;

		public Address(String city, String area, int pinCode) {
			this.city = city;
			this.area = area;
			this.pinCode = pinCode;
		}
	}

	private static class Department {
		int departmentId;
		String departmentName;
		List<Employee> employees;

		public Department(int departmentId, String departmentName, List<Employee> employees) {
			this.departmentId = departmentId;
			this.departmentName = departmentName;
			this.employees = employees;
		}
	}

	private static class Data {
		static private final List<Employee> empListDev = Arrays.asList(
				new Employee(1, "Rushikesh", "Karkhanis", 25, 10000, new Address("Navi Mumbai", "Sanpada", 400706)),
				new Employee(2, "Aarju", "Tripathi", 24, 15000, new Address("Pune", "Hinjewadi", 500506)),
				new Employee(3, "Sachin", "Tendulkar", 25, 20000, new Address("Pune", "Hinjewadi", 400708)),
				new Employee(3, "Sachin", "Narang", 26, 20000, new Address("Pune", "Hinjewadi", 400708)),
				new Employee(4, "Nupur", "Shah", 26, 25000, new Address("Nagpur", "PremNagar", 100806)),
				new Employee(5, "Priyanka", "Das", 25, 30000, new Address("Kolkata", "Bangur", 900700)));
		static private final List<Employee> empListQA = Arrays.asList(
				new Employee(1, "Rajesh", "Patil", 28, 60000, new Address("Jalgoan", "Kopri", 401706)),
				new Employee(2, "Masoom", "Jain", 29, 75000, new Address("Mumbai", "Bandra", 500506)),
				new Employee(3, "Biju", "Singh", 25, 80000, new Address("Amritsar", "Gulab Bagh", 400708)));
		static private final List<Employee> empListDevOps = Arrays.asList(
				new Employee(1, "Javed", "Shaik", 28, 60000, new Address("Delhi", "Firadabad", 401706)),
				new Employee(2, "Tiwari", "Chandramani", 29, 75000, new Address("Bihar", "Nagar", 800506)),
				new Employee(3, "Nilesh", "Firke", 35, 80000, new Address("Navi Mumbai", "Belapur", 400708)));
		static private final List<Employee> empListManager = Arrays.asList(
				new Employee(1, "Rohan", "Kumar", 38, 160000, new Address("Delhi", "Firadabad", 401706)),
				new Employee(2, "KumarPal", "Jain", 39, 175000, new Address("Bangalore", "Nagar", 800506)),
				new Employee(3, "Mayur", "Chitnis", 45, 180000, new Address("Mumbai", "Belapur", 400708)));

		public static List<Department> departments = Arrays.asList(new Department(1, "Dev", empListDev),
				new Department(2, "Qa", empListQA), new Department(3, "DevOps", empListDevOps),
				new Department(4, "Manager", empListManager));
	}
}
