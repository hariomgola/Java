package Java_Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Incido_Java {
	public static void main(String[] args) {
		Question_1();
		// Question_2();

	}

	public static void Question_1() {
		// Find the second heighest value from an array
		Integer[] data = { 7, 8, 2, 0, 2, 3, 4, 5 };
		ArrayList<Integer> _list = new ArrayList<Integer>(Arrays.asList(data));
		/**
		 * Functionality
		 * 
		 * @Distinct - To remove the dublicate values
		 * @Sorted - To sort the list in asc and dsc
		 * @Limit - To limit the stream to 2 index only
		 * @Skip - To skip the number of iteration
		 * @findFirst - To give the first Element only
		 */

		_list.stream().distinct().sorted(Comparator.reverseOrder()).limit(2).skip(1).forEach(_data -> {
			System.out.println(_data);
		});

	}

	public static void Question_2() {
		// Reverse the String
		String[] _newData = "My name is Ram".split(" ");
		// Reverse using the collection
		Collections.reverse(Arrays.asList(_newData));

		// Using Inbuild functionality
		System.out.println(String.join(" ", _newData));

		// Using Streams
		Arrays.stream(_newData).forEach(_data -> {
			System.out.print(_data + " ");
		});
	}
}
