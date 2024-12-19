package Java_Leet_Code_Interview150;

import java.util.HashMap;

public class _169_majority_element {

	public static void main(String[] args) {
		_169_majority_element cs = new _169_majority_element();
		cs.majorityElement(new int[] { 3, 2, 3 });
	}

	public int majorityElement(int[] nums) {
		int secondValue = (int) Math.round((double) nums.length / 2);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] >= secondValue) {
				return nums[i];
			}
		}
		return 0;
	}

}
