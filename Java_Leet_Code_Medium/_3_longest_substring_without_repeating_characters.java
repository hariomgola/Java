package Java_Leet_Code_Medium;

public class _3_longest_substring_without_repeating_characters {

	public static void main(String[] args) {
		_3_longest_substring_without_repeating_characters cs = new _3_longest_substring_without_repeating_characters();
		cs.lengthOfLongestSubstring("abcabcbb");

	}

	public int lengthOfLongestSubstring(String s) {
		String[] data = s.split("");
		int _returnResponse = 0;
		for (int i = 0; i < data.length; i++) {
			String _temp = data[i];
			for (int j = i + 1; j < data.length; j++) {
				if (_temp.contains(data[j])) {
					break;
				} else {
					_temp += data[j];
				}
			}
			if (_temp.length() > _returnResponse) {
				_returnResponse = _temp.length();
			}
		}
		return _returnResponse;
	}

}
