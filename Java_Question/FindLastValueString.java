package Java_Question;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class FindLastValueString {

	public static void main(String[] args) {
		// Data Using
		String _name = "HariomGola".toLowerCase();
		String[] name_array = _name.split("");
		// Stream.of(name_array).findFirst()

		// Reversing an array
		List<String> name_List = Arrays.asList(name_array);
		// Collections.reverse(name_List);

		// Hash Map
		HashMap<String, Integer> local_hashmap = new HashMap<String, Integer>();

		// Using Streams for same
		Optional<String> last_value = name_List.stream().map(_data -> {
			if (local_hashmap.get(_data) != null) {
				// System.out.println(local_hashmap.get(_data).getClass().getName());
				local_hashmap.put(_data, local_hashmap.get(_data) + 1);
			} else {
				local_hashmap.put(_data, 0);
			}
			return _data + local_hashmap.get(_data);
		}).filter(_data -> {
			// Filtering the Single repeated character
			return _data.split("")[1].equals("0");
		}).map(_data -> {
			// returning the character only
			return _data.split("")[0];
		}).reduce((first, second) -> second);

		// Printing out the data
		// Here to Get value from optional using .get()
		System.out.print("Last Non Repeating Character in string - " + last_value.get());
	}

}
