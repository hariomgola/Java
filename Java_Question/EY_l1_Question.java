package Java_Question;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;

public class EY_l1_Question {
	public static void main(String[] args) {
		// write stream api to sort hashmap on the basis of value | sort in ascending
		// and descending order eX

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Mango");
		map.put(5, "Sample");
		map.put(2, "Banana");
		map.put(3, "Apple");
		map.put(4, "Orange");

		// map.entry compare by value

		map.entrySet().stream().map(_data -> {
			return _data.getValue() + "-" + _data.getKey();
		}).sorted(Comparator.reverseOrder()).forEach(_data -> {
			System.out.println(_data.split("-")[0] + "-" + _data.split("-")[1]);
		});
	}
}
