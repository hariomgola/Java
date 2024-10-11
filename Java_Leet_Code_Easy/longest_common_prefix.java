package Java_Leet_Code_Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class longest_common_prefix {

	public static void main(String[] args) {
		longest_common_prefix cs = new longest_common_prefix();
		cs.longestCommonPrefix(new String[] { "flower", "flow", "flight" });
		cs.longestCommonPrefix(new String[] { "dog", "racecar", "car" });
		cs.longestCommonPrefix(new String[] { "a" });

	}

	public String longestCommonPrefix(String[] strs) {
		if(strs.length == 1) {
			return strs[1];
		}
		Arrays.sort(strs, (a, b) -> Integer.compare(a.length(), b.length()));
		String _finalPrefix = "";
		outerLoop: for (int i = 0; i < strs[0].length(); i++) {
			innerLoop: for (int j = 0; j < strs.length; j++) {

				if (strs[0].substring(0, i).equals(strs[j].substring(0, i))) {
					continue;
				} else {
					break outerLoop;
				}
			}
			_finalPrefix = strs[0].substring(0, i);

		}

		return _finalPrefix;

	}
}
