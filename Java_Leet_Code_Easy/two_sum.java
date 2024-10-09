package Java_Leet_Code_Easy;

public class two_sum {

	public static void main(String[] args) {
		int[] i1 = { 2, 7, 11, 15 };

		two_sum _ts = new two_sum();
		_ts.twoSum(i1, 9);
	}

	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {

					return new int[] { i, j };
				}
			}
		}
		return new int[] {};
	}

}
