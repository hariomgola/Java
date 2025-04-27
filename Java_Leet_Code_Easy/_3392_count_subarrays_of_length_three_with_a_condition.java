package Java_Leet_Code_Easy;

import java.util.HashSet;

public class _3392_count_subarrays_of_length_three_with_a_condition {

	public static void main(String[] args) {
		_3392_count_subarrays_of_length_three_with_a_condition cs = new _3392_count_subarrays_of_length_three_with_a_condition();
		cs.countSubarrays(new int[] { 1, 2, 1, 4, 1 });
		cs.countSubarrays(new int[] { 0, 0, 0, 0 });

	}

	public int countSubarrays(int[] nums) {
		int _counter = 0;
		for (int i = 0; i < nums.length - 2; i++) {
			if ((nums[i] + nums[i + 2]) * 2 == nums[i + 1]) {
				_counter += 1;
			}
		}
		return _counter;
	}

}
