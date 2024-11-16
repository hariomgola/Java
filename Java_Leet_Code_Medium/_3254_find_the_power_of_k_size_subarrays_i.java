package Java_Leet_Code_Medium;

import java.util.ArrayList;

public class _3254_find_the_power_of_k_size_subarrays_i {

	public static void main(String[] args) {
		_3254_find_the_power_of_k_size_subarrays_i cs = new _3254_find_the_power_of_k_size_subarrays_i();
		cs.resultsArray(new int[] { 1, 2, 3, 4, 3, 2, 5 }, 3);
		cs.resultsArray(new int[] { 2, 2, 2, 2, 2 }, 4);
		cs.resultsArray(new int[] { 3, 2, 3, 2, 3, 2 }, 2);
		cs.resultsArray(new int[] { 3 }, 1);
		cs.resultsArray(new int[] { 1, 3, 4 }, 2);
	}

	public int[] resultsArray(int[] nums, int k) {
		int _length = nums.length;
		int[] _as = new int[_length - k + 1];
		outer: for (int i = 0; i < _length; i++) {
			if (_length - k - i >= 0) {
				int tempValue = nums[i];
				inner: for (int j = i; j < i + k - 1; j++) {
					if (nums[j] >= nums[j + 1] || nums[j] + 1 != nums[j + 1]) {
						tempValue = -1;
						break inner;
					} else {
						tempValue = nums[j + 1];
					}
				}
				_as[i] = tempValue;
			} else {
				break outer;
			}
		}
		return _as;
	}

}
