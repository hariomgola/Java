package Java_Leet_Code_Interview150;

import java.util.Arrays;

public class _189_rotate_array {
	// success
	public static void main(String[] args) {
		_189_rotate_array cs = new _189_rotate_array();
		cs.rotate(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 3);

	}

	public void rotate(int[] nums, int k) {
		while (k > 0) {
			int temp = nums[nums.length - 1];
			for (int i = nums.length - 1; i > 0; i--) {
				nums[i] = nums[i - 1];
			}
			nums[0] = temp;
			k--;
		}
	}
}
