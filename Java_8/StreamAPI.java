package Java_8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamAPI {
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
		Stream<User> userStream;

		user.stream().map(_user -> {
			_user.setId(_user.getId() * 2);
			return _user;
		}).forEach(_user -> {
			System.out.println(_user.getId());
		});
	}
}
