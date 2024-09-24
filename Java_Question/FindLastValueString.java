package Java_Question;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
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
		Collections.reverse(name_List);

		// Hash Map
		HashMap<String, Integer> local_hashmap = new HashMap<String, Integer>();

		// Using Streams for same
		AtomicInteger local_index = new AtomicInteger(0);
		name_List.stream().map(_data -> {
			local_index.incrementAndGet(); // Increasing the Index
			if (local_hashmap.get(_data) != null)
				local_hashmap.put(_data, local_hashmap.get(_data) + 1);
			else
				local_hashmap.put(_data, 1);

			return _data;
		}).filter(_data -> local_hashmap.get(_data) > 0).forEach(_data -> {
			System.out.println(" |> " + _data);
			System.out.println(" |> " + local_hashmap);
		});
		;
	}

}
