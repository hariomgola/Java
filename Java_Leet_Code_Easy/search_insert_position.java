package Java_Leet_Code_Easy;

public class search_insert_position {

	public static void main(String[] args) {
		search_insert_position cs = new search_insert_position();
		cs.searchInsert(new int[] { 1, 3, 5, 6 }, 2);
	}

	public int searchInsert(int[] nums, int target) {
		int _insertIndex = 0;
		for (int i = 0; i < nums.length; i++) {
			if (target <= nums[i]) {
				break;
			} else {
				_insertIndex++;
			}
		}
		return _insertIndex;
	}

}
