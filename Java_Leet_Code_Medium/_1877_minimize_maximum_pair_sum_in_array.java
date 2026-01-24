package Java_Leet_Code_Medium;

import java.util.Arrays;

public class _1877_minimize_maximum_pair_sum_in_array {

	public static void main(String[] args) {
		_1877_minimize_maximum_pair_sum_in_array cs = new _1877_minimize_maximum_pair_sum_in_array();
		cs.minPairSum(new int[] { 3, 5, 2, 3 });
		cs.minPairSum(new int[] { 3, 5, 4, 2, 4, 6 });

	}

	public int minPairSum(int[] nums) {
		Arrays.sort(nums);
		int numsLength = nums.length;
		int maxLength = 0;
		for (int i = 0; i < numsLength / 2; i++) {
			if (nums[i] + nums[numsLength - i - 1] > maxLength) {
				maxLength = nums[i] + nums[numsLength - i - 1];
			}
		}
		return maxLength;
	}

}
