package Java_Leet_Code_Interview150;

import java.util.HashMap;

public class _80_remove_duplicates_from_sorted_array_ii {
	// success
	public static void main(String[] args) {
		_80_remove_duplicates_from_sorted_array_ii cs = new _80_remove_duplicates_from_sorted_array_ii();
		cs.removeDuplicates(new int[] { 1, 1, 1, 2, 2, 3 });
		cs.removeDuplicates(new int[] { 0, 0, 1, 1, 1, 1, 2, 3, 3 });
	}

	public int removeDuplicates(int[] nums) {
		int _index = 0;
		HashMap<Integer, Integer> _hs = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			_hs.put(nums[i], _hs.get(nums[i]) == null ? 1 : _hs.get(nums[i]) + 1);
			if (_hs.get(nums[i]) <= 2) {
				nums[_index++] = nums[i];
			}
		}
		return _index;
	}

}
