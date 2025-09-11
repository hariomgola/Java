package Java_Leet_Code_Medium;

import java.util.Arrays;
import java.util.Set;

public class _2785_sort_vowels_in_a_string {

	public static void main(String[] args) {
		_2785_sort_vowels_in_a_string cs = new _2785_sort_vowels_in_a_string();
		cs.sortVowels("lEetcOde");
	}

	public String sortVowels(String s) {
		char[] charArray = s.toCharArray();
		Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
		for (int i = 0; i < charArray.length; i++) {
			System.out.print("'" + charArray[i] + "'  -  ");
			if (vowels.contains(charArray[i])) {
//				System.out.println(charArray[i]);
			}
		}

		System.out.println(new String(charArray));
		return "";
	}

}
