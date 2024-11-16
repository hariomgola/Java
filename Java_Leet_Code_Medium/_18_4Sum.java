package Java_Leet_Code_Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class _18_4Sum {

	public static void main(String[] args) {
		_18_4Sum cs = new _18_4Sum();
		cs.fourSum(new int[] { 1, 0, -1, 0, -2, 2 }, 0);
		cs.fourSum(new int[] { 2, 2, 2, 2, 2 }, 8);
		cs.fourSum(new int[] { 1000000000, 1000000000, 1000000000, 1000000000 }, -294967296);
	}

	public List<List<Integer>> fourSum(int[] nums, int target) {
		int arrLength = nums.length;
		HashSet<List<Integer>> _ls = new HashSet<List<Integer>>();
		for (int i = 0; i < arrLength; i++) {
			if (i + 4 <= arrLength) {
				for (int j = i + 1; j < arrLength; j++) {
					for (int k = j + 1; k < arrLength; k++) {
						for (int l = k + 1; l < arrLength; l++) {
							if ((double) nums[i] + (double) nums[j] + (double) nums[k]
									+ (double) nums[l] == (double) target) {
								List<Integer> __ls = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
								__ls.sort(null);
								_ls.add(__ls);
								break;
							}
						}
					}
				}
			}
		}
		return new ArrayList<>(_ls);
	}

}
