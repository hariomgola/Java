package Java_Question;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Input - 5, 12, 37, 8,5,12,37,5 Output - {5=3, 37=2, 8=1, 12=2}
 */
public class GridDyanmics_Question {

	public static void main(String[] args) {
		Integer[] integerData = new Integer[] { 5, 12, 37, 8, 5, 12, 37, 5 };
		Map<Integer, Long> frequencyMap = Arrays.stream(integerData)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(frequencyMap.toString());

	}
}
