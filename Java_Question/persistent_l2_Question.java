package Java_Question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class persistent_l2_Question {

	public static void main(String[] args) {
		// Question 1
		List<Integer> arrayData = Arrays.asList(0, 1, 2, 3, 0, 5, 7, 9, 0, 0, 0);
		arrayData = arrayData.stream().sorted().collect(Collectors.toList());

		Stream<Integer> newStream = Stream.concat(arrayData.subList(0, arrayData.lastIndexOf(0)).stream(), arrayData
				.subList(arrayData.lastIndexOf(0) + 1, arrayData.size()).stream().sorted(Comparator.reverseOrder()));
		newStream.forEach(_data -> {
			System.out.print(_data+" ");
		});

		// Question 2
		System.out.println();
		String inputString = "Java Concept Of The Day".toLowerCase();
		HashMap<String, Integer> _hs = new HashMap<String, Integer>();
		String[] data = inputString.split("");

		Arrays.stream(data).filter(_data -> _data.equals(" ") ? false : true).map(_data -> {
			_hs.put(_data, _hs.get(_data) == null ? 1 : _hs.get(_data) + 1);
			return _data;
		}).distinct().collect(Collectors.toList()).stream().forEach(_data -> {
			System.out.print(_data + "- " + _hs.get(_data) + " | ");
		});
	}

}

/**
 * emp id lastname, department, created by, updated by you want to delete the
 * dublicate data from the table and keep the last updated records of all the
 * employee Delete from customer where empId not in (select
 * empId,distinct(firstName,LastName,department) from customer where) Select *
 * from customer
 */
