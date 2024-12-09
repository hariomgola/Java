package Java_Leet_Code_Medium;

public class _3152_special_array_ii {

	public static void main(String[] args) {
		_3152_special_array_ii cs = new _3152_special_array_ii();
		cs.isArraySpecial(new int[] { 3, 4, 1, 2, 6 }, new int[][] { { 0, 4 } });
		cs.isArraySpecial(new int[] { 4, 3, 1, 6 }, new int[][] { { 0, 2 }, { 2, 3 } });
		cs.isArraySpecial(new int[] { 1 }, new int[][] { { 0, 0 } });
	}

	public boolean[] isArraySpecial(int[] nums, int[][] queries) {
		int queriesLength = queries.length;
		boolean[] _finalResult = new boolean[queriesLength];
		for (int i = 0; i < queriesLength; i++) {
			boolean isPerfect = true;
			inner: for (int j = queries[i][0]; j < queries[i][1]; j++) {
				if (nums[j] % 2 == nums[j + 1] % 2) {
					isPerfect = false;
					break inner;
				}
			}
			_finalResult[i] = isPerfect;
		}
		return _finalResult;
	}
}
