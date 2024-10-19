package Java_Leet_Code_Easy;

public class _27_remove_element {

	public static void main(String[] args) {
		_27_remove_element cs = new _27_remove_element();
		cs.removeElement(new int[] { 3, 2, 2, 3 }, 3); // 2
		cs.removeElement(new int[] { 0, 1, 2, 2, 3, 0, 4, 2 }, 2); // 5
		cs.removeElement(new int[] { 2 }, 3); // 1
		cs.removeElement(new int[] { 1 }, 1); // 0
	}

	public int removeElement(int[] nums, int val) {
		int _iteratorIndex = 0;
		for (int i = 0; i < nums.length; i++) {
			nums[i - _iteratorIndex] = nums[i];
			if (nums[i] == val) {
				_iteratorIndex++;
			}
		}
		return nums.length - _iteratorIndex;
	}

}
