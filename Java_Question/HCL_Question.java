package Java_Question;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class HCL_Question {

	public static void main(String[] args) {
		HashMap<String, Integer> _hash = new HashMap<String, Integer>();

		Arrays.stream("Indian".toLowerCase().split("")).map(_data -> {
			if (_hash.get(_data) != null) {
				_hash.put(_data, 1);
			} else {
				_hash.put(_data, 0);
			}
			return _data;
		}).forEach(_data -> {
			// System.out.println(_data);
		});

		Arrays.stream("Indian".toLowerCase().split("")).forEach(_data -> {
			if (_hash.get(_data) == 0) {
				System.out.println("|> " + _data);
			}
		});
	}

}
