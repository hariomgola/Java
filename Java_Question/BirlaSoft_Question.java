package Java_Question;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BirlaSoft_Question {
	public static void main(String[] args) {
		String[] fruitData = new String[] { "apple", "mango", "banana", "jack" };
		// Output -> "jack","banana","mango", "apple"
		List<String> _finalOutput = IntStream.range(0, fruitData.length)
				.mapToObj(i -> fruitData[fruitData.length - 1 - i]).collect(Collectors.toList());
		System.out.println(_finalOutput.toString());
	}
}
