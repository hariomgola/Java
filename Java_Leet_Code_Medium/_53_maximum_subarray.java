package Java_Leet_Code_Medium;

public class _53_maximum_subarray {

	public static void main(String[] args) {
		_53_maximum_subarray cs = new _53_maximum_subarray();
		cs.maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 });
		cs.maxSubArray(new int[] { 1 });
		cs.maxSubArray(new int[] { 5, 4, -1, 7, 8 });
		cs.maxSubArray(new int[] { -2, 1 });
	}

	public int maxSubArray(int[] nums) {
		int returnValue = nums[0];
		for (int i = 0; i < nums.length; i++) {
			int _temp = nums[i];
			if (_temp > returnValue) {
				returnValue = _temp;
			}
			for (int j = i + 1; j < nums.length; j++) {
				_temp += nums[j];
				if (_temp > returnValue) {
					returnValue = _temp;
				}
			}
		}
		return returnValue;
	}

}
