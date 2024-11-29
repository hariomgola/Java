package Java_Leet_Code_Medium;

public class _16_3sum_closest {

	public static void main(String[] args) {
		_16_3sum_closest cs = new _16_3sum_closest();
		cs.threeSumClosest(new int[] { -1, 2, 1, -4 }, 1);
		cs.threeSumClosest(new int[] { 4, 0, 5, -5, 3, 3, 0, -4, -5 }, -2);
	}

	public int threeSumClosest(int[] nums, int target) {
		int _arrayBound = 3;

		int _closestSumDifference = Integer.MAX_VALUE;
		int _finalValue = 0;

		outer: for (int i = 0; i < nums.length - _arrayBound + 1; i++) {
			int _temp = nums[i];
			for (int j = i + 1; j < i + _arrayBound; j++) {
				_temp += nums[j];
			}
			if (_temp == target) {
				_finalValue = _temp;
				break outer;
			} else if (Math.abs(_temp - target) < Math.abs(_closestSumDifference)) {
				_closestSumDifference = _temp - target;
				_finalValue = _temp;
			}
		}

		System.out.println(">>>" + _finalValue);
		return _finalValue;
	}

}
