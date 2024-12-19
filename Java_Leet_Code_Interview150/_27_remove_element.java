package Java_Leet_Code_Interview150;

import java.util.Arrays;

public class _27_remove_element {
	// success
	public static void main(String[] args) {
		_27_remove_element cs = new _27_remove_element();
		cs.removeElement(new int[] { 3, 2, 2, 3 }, 3);
		cs.removeElement(new int[] { 0, 1, 2, 2, 3, 0, 4, 2 }, 2);
	}

	public int removeElement(int[] nums, int val) {
		int _index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[_index++] = nums[i];
			}
		}
		return _index;
	}

}
