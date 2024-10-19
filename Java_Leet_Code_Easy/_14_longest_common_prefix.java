package Java_Leet_Code_Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class _14_longest_common_prefix {

	public static void main(String[] args) {
		_14_longest_common_prefix cs = new _14_longest_common_prefix();
		cs.longestCommonPrefix(new String[] { "flower", "flow", "flight" });
		cs.longestCommonPrefix(new String[] { "dog", "racecar", "car" });
		cs.longestCommonPrefix(new String[] { "a" });

	}

	public String longestCommonPrefix(String[] strs) {
		Arrays.sort(strs, (a, b) -> Integer.compare(a.length(), b.length()));
		String _finalPrefix = "";
		outerLoop: for (int i = 0; i < strs[0].length(); i++) {
			String _currentValue = strs[0].substring(0, i + 1);
			for (int j = 0; j < strs.length; j++) {
				if (strs[j].substring(0, i + 1).equals(_currentValue)) {
					continue;
				} else {
					break outerLoop;
				}
			}
			_finalPrefix = _currentValue;

		}

		return _finalPrefix;

	}
}
