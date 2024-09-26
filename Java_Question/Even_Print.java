package Java_Question;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class Even_Print {

	public static void main(String[] args) {
		String string = "this is a string we need need to need to find the the duplicate words";
		String[] array_string = string.split("");
		List<String> _list = Arrays.asList(array_string);
		HashMap<String, Integer> hash_Map = new HashMap<String, Integer>();
		for (int i = 0; i < array_string.length; i++) {
			if (hash_Map.get(array_string[i]) != null) {
				hash_Map.put(array_string[i], hash_Map.get(array_string[i]) + 1);
			} else {
				hash_Map.put(array_string[i], 1);
			}
		}

		_list.stream().filter(_data -> {
			return hash_Map.get(_data) != null && hash_Map.get(_data) > 1 ? true : false;
		}).forEach(_data -> {
			System.out.println(_data + " - " + hash_Map.get(_data));
		});

	}

}
