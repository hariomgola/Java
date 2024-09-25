package Java_Question;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumArrayStream {

	public static void main(String[] args) {
		int[] value_array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<Integer> _list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// Using Streams
		Optional<Integer> _sumValue = _list.stream().filter(_data -> {
			return _data % 2 == 0 ? true : false;
		}).reduce((first, second) -> first + second);
		System.out.println(_sumValue.get());
	}
}
