package Java_8;

import java.util.HashMap;

public class HashMapFunctionality {

	public static void main(String[] args) {
		HashMap<String, String> users = new HashMap<String, String>();
		users.put("one", "Hari");
		users.put("two", "Raj");
		users.put("three", "Manoj");
		System.out.println(" |> " + users);
		// accessing
		users.get("two");
		// Removing
		users.remove("three");
		// Size
		users.size();

		// Print
		for (String i : users.keySet()) {
			System.out.println("Keys " + i);
		}
		for (String i : users.values()) {
			System.out.println("Values " + i);
		}
	}

}
