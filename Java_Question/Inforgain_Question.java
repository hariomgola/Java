package Java_Question;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Inforgain_Question {

	public static void main(String[] args) {
		// Code to print the String that contains duplicate array
		Arrays.asList(new String[] { "aa", "abc", "bbc", "cef" }).stream().filter(_data -> {
			HashSet<String> _hs = new HashSet<String>();
			Arrays.stream(_data.split("")).forEach(_inhs -> _hs.add(_inhs));
			return _data.length() != _hs.size();
		}).forEach(_data -> {
			System.out.println(_data);
		});

		Arrays.asList(new String[] { "aa", "abc", "bbc", "cef" }).stream().filter(_data -> {
			return Arrays.stream(_data.split("")).distinct().toList().size() != _data.length();
		}).forEach(_data -> {
			System.out.println(_data);
		});

	}

}
