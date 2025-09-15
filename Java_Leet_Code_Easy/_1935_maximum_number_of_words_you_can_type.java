package Java_Leet_Code_Easy;

import java.util.HashSet;

public class _1935_maximum_number_of_words_you_can_type {

	public static void main(String[] args) {
		_1935_maximum_number_of_words_you_can_type cs = new _1935_maximum_number_of_words_you_can_type();
		cs.canBeTypedWords("hello world", "ad");
	}

	public int _canBeTypedWords(String text, String brokenLetters) {
		HashSet<String> _hs = new HashSet<String>();
		int finalWorkingWord = 0;
		String[] _brokenLetter = brokenLetters.split("");
		// Adding broken letter in hashSet
		for (int i = 0; i < _brokenLetter.length; i++) {
			_hs.add(_brokenLetter[i]);
		}

		// Checking Which letter i can write
		String[] _text = text.split(" ");
		for (int i = 0; i < _text.length; i++) {
			String[] _internalData = _text[i].split("");
			boolean isValidWord = true;
			for (int j = 0; j < _internalData.length; j++) {
				if (_hs.contains(_internalData[j])) {
					isValidWord = false;
					break;
				}
			}
			if (isValidWord) {
				finalWorkingWord += 1;
			}
		}
		return finalWorkingWord;
	}

	public int canBeTypedWords(String text, String brokenLetters) {
		HashSet<Character> _hs = new HashSet<Character>();
		for (char ch : brokenLetters.toCharArray()) {
			_hs.add(ch);
		}

		int count = 0;
		for (String word : text.split(" ")) {
			boolean isValidText = true;
			for (int i = 0; i < word.length(); i++) {
				if (_hs.contains(word.charAt(i))) {
					isValidText = false;
					break;
				}
			}
			if (isValidText)
				count++;
		}

		return count;
	}

}
