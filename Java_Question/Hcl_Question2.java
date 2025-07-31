package Java_Question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/*
 - remove duplicates - done
 - convert each in upper case - done
 - sort it in reverse alphabetical order
 - Collect them into a single string with
*/
public class Hcl_Question2 {
	public static void main(String[] args) {
		String[] arrData = new String[] { "apple", "banana", "apple", "orange", "banana" };

		String finalOutput = Arrays.stream(arrData).distinct().map(_data -> _data.toUpperCase())
				.sorted(Comparator.reverseOrder()).reduce("", (a, b) -> a +","+ b);
		// Using Collectors
		String final_Output = Arrays.stream(arrData).distinct().map(_data -> _data.toUpperCase())
				.sorted(Comparator.reverseOrder()).collect(Collectors.joining(","));;
		System.out.println("Final Output -> " + final_Output);
	}
}
