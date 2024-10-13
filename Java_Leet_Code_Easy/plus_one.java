package Java_Leet_Code_Easy;

import java.util.Arrays;
import java.util.Collections;

public class plus_one {

	public static void main(String[] args) {
		plus_one cs = new plus_one();
		cs.plusOne(new int[] { 1, 2, 3 });
		cs.plusOne(new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 });
		cs.plusOne(new int[] { 7, 2, 8, 5, 0, 9, 1, 2, 9, 5, 3, 6, 6, 7, 3, 2, 8, 4, 3, 7, 9, 5, 7, 7, 4, 7, 4, 9, 4, 7,
				0, 1, 1, 1, 7, 4, 0, 0, 6 });
	}

	public int[] plusOne(int[] digits) {
		String _initialValue = "";
		int _remainingValue = 1;
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] + _remainingValue > 9) {
				_remainingValue = (digits[i] + _remainingValue) / 10;
				_initialValue += (digits[i] + _remainingValue) % 10;
			} else {
				_initialValue += digits[i] + _remainingValue;
				_remainingValue = 0;
			}

		}
		if (_remainingValue > 0) {
			_initialValue += _remainingValue;
		}
		StringBuffer sb = new StringBuffer(_initialValue);
		sb.reverse();
		return Arrays.stream(sb.toString().split("")).mapToInt(Integer::parseInt).toArray();
	}

}
