package Java_Question;

import java.util.Comparator;
import java.util.HashMap;
import java.util.stream.Collectors;

public class itcinfortech_question {
	public static void main(String[] args) {
		HashMap<Character, Integer> _hs = new HashMap<Character, Integer>();
		_hs.put('a', 1);
		_hs.put('b', 6);
		_hs.put('c', 9);
		_hs.put('d', 4);
		_hs.put('e', 8);

		// sorting and concetinate - adbec
		String finalResult = _hs.entrySet().stream().sorted(Comparator.comparingInt(_data -> _data.getValue()))
				.map(_data -> _data.getKey().toString()).collect(Collectors.joining("", "", ""));
		System.out.print("|> " + finalResult);

	}

}
