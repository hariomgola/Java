package Java_Leet_Code_Easy;

import java.util.HashMap;
import java.util.HashSet;

public class _961_n_repeated_element_in_size_2n_array {

	public static void main(String[] args) {
		_961_n_repeated_element_in_size_2n_array cs = new _961_n_repeated_element_in_size_2n_array();
		cs.repeatedNTimes(new int[] { 1, 2, 3, 3 });
		cs.repeatedNTimes(new int[] { 2, 1, 2, 5, 3, 2 });
		cs.repeatedNTimes(new int[] { 5, 1, 5, 2, 5, 3, 5, 4 });

	}

	public int _repeatedNTimes(int[] nums) {
		// - When you need to return the count as well -
		HashMap<Integer, Integer> _hs = new HashMap<Integer, Integer>();
		int maxInt = nums[0];
		int maxValue = 0;
		for (int i = 0; i < nums.length; i++) {
			if (_hs.get(nums[i]) == null) {
				_hs.put(nums[i], 1);
			} else {
				int _max = _hs.get(nums[i]) + 1;
				_hs.put(nums[i], _max);
				if (maxValue < _max) {
					maxValue = _max;
					maxInt = nums[i];
				}
			}
		}
		return maxInt;
	}

	public int repeatedNTimes(int[] nums) {
		HashSet<Integer> _hs = new HashSet<Integer>();
		for (int num : nums) {
			if (!_hs.add(num)) {
				return num;
			}
		}
		return -1;
	}

}
