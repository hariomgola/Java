package Java_Leet_Code_Medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class _2461_maximum_sum_of_distinct_subarrays_with_length_k {

	public static void main(String[] args) {
		_2461_maximum_sum_of_distinct_subarrays_with_length_k cs = new _2461_maximum_sum_of_distinct_subarrays_with_length_k();
		cs.maximumSubarraySum(new int[] { 1, 5, 4, 2, 9, 9, 9 }, 3);// 15
		cs.maximumSubarraySum(new int[] { 4, 4, 4 }, 3);// 0
		cs.maximumSubarraySum(new int[] { 1, 2, 2 }, 2);// 3
		cs.maximumSubarraySum(new int[] { 2, 1, 2, 1, 2 }, 3);// 0
		cs.maximumSubarraySum(new int[] { 1, 1, 1, 7, 8, 9 }, 3);// 24
	}

	public long maximumSubarraySum(int[] nums, int k) {
		long finalResult = 0;
		for (int i = 0; i <= nums.length - k; i++) {
			Set<Integer> seen = new HashSet<>();
			long currentSum = 0;
			boolean dublicateFound = false;

			for (int j = i; j < i + k; j++) {
				if (!seen.add(nums[j])) {
					dublicateFound = true;
					break;
				}
				currentSum += nums[j];
			}

			if (!dublicateFound) {
				finalResult = Math.max(finalResult, currentSum);
			}
		}

		return finalResult;
	}

}
