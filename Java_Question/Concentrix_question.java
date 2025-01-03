package Java_Question;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Concentrix_question {

	// Give the second largest number of repeated character
	public static void main(String[] args) {
		Integer[] _arr = new Integer[] { 6, 1, 2, 2, 2, null, 3, 3, 5, 5, 5, 5 };
		Arrays.stream(_arr).filter(_data -> _data != null).collect(Collectors.groupingBy(_data -> _data)).entrySet()
				.stream()
				.sorted((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()))
				.toList().forEach(_data -> {
					System.out.println("  ********  ");
					System.out.println(_data + "  -  " + _data.getKey());
				});
	}

}
