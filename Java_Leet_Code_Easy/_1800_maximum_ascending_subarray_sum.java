package Java_Leet_Code_Easy;

public class _1800_maximum_ascending_subarray_sum {

	public static void main(String[] args) {
		_1800_maximum_ascending_subarray_sum cs = new _1800_maximum_ascending_subarray_sum();
		cs.maxAscendingSum(new int[] { 10, 20, 30, 5, 10, 50 });
		cs.maxAscendingSum(new int[] { 10, 20, 30, 40, 50 });
		cs.maxAscendingSum(new int[] { 12, 17, 15, 13, 10, 11, 12 });
		cs.maxAscendingSum(new int[] { 100, 10, 1 });
	}

	public int maxAscendingSum(int[] nums) {
		int sum = 0;
		int maxSum = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i == 0) {
				maxSum += nums[i];
			} else if (nums[i] > nums[i - 1]) {
				maxSum += nums[i];
			} else {
				maxSum = 0;
				maxSum += nums[i];
			}

			if (maxSum > sum) {
				sum = maxSum;
			}
		}
		return sum;
	}

}
