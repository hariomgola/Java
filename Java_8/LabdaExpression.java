package Java_8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class LabdaExpression {
	private static List<User> user = new ArrayList<User>();

	// Once this Runs data will be available
	static {
		user.add(new User(1, "H", 5.25));
		user.add(new User(2, "Ha", 14.50));
		user.add(new User(3, "Har", 22.02));
		user.add(new User(4, "Hari", 16.50));
		user.add(new User(5, "Hario", 24.00));
	}

	public static void main(String[] args) {
		// using the lambda expression here
		user.forEach((_user) -> {
			System.out.println(_user);
		});
		// using the lambda expression to print more values
		user.forEach((_user) -> {
			System.out.print("User ID - " + _user.getId() + " | ");
			System.out.print("User Name - " + _user.getName() + " | ");
			System.out.println("User Salary - " + _user.getSalary());
		});
		// using the labda express to store in a variable
		Consumer<User> lambdaConsumer = _user -> {
			System.out.println(_user.getSalary());
		};
		user.forEach(lambdaConsumer);

		sortUser();
	}

	public static void sortUser() {
		Collections.sort(user, new Comparator<User>() {
			@Override
			public int compare(User a, User b) {
				if (a.getSalary() > b.getSalary()) {
					return -1; // Here -1 for placing the object before
				} else if (a.getSalary() < b.getSalary()) {
					return 1; // Here +1 for placing the object after
				}
				return 0; // Here 0 no change
			}
		});

		Consumer<User> lambdaConsumer = _user -> {
			System.out.println("ID - " + _user.getId());
		};
		user.forEach(lambdaConsumer);
	}
}