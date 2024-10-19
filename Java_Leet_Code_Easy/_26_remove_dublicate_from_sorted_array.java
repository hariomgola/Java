package Java_Leet_Code_Easy;

public class _26_remove_dublicate_from_sorted_array {

	public static void main(String[] args) {
		_26_remove_dublicate_from_sorted_array cs = new _26_remove_dublicate_from_sorted_array();
		cs.removeDuplicates(new int[] { 1, 1, 2 });
		cs.removeDuplicates(new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 });

	}

	public int removeDuplicates(int[] nums) {
		int _iteratorIndex = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i + 1]) {
				nums[_iteratorIndex] = nums[i];
				_iteratorIndex += 1;
			}
		}
		if (nums[_iteratorIndex] != nums[nums.length - 1]) {
			nums[_iteratorIndex] = nums[nums.length - 1];
		}
		return _iteratorIndex + 1;
	}

}
