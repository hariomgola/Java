package Java_Leet_Code_Interview150;

import java.util.Arrays;
import java.util.HashMap;

public class _26_remove_duplicates_from_sorted_array {

	public static void main(String[] args) {
		_26_remove_duplicates_from_sorted_array cs = new _26_remove_duplicates_from_sorted_array();
		cs.removeDuplicates(new int[] { 1, 1, 2 });
		cs.removeDuplicates(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 });
	}

	public int removeDuplicates(int[] nums) {
		HashMap<Integer, Integer> _hs = new HashMap<Integer, Integer>();
		int _index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (_hs.get(nums[i]) == null) {
				_hs.put(nums[i], 1);
				nums[_index++] = nums[i];
			}
		}
		return _index;
	}

}
