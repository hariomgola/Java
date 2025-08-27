package Java_Leet_Code_Medium;

public class _1493_Longest_Subarray_of_1_After_Deleting_One_Element {

	public static void main(String[] args) {
		_1493_Longest_Subarray_of_1_After_Deleting_One_Element cs = new _1493_Longest_Subarray_of_1_After_Deleting_One_Element();
		cs.longestSubarray(new int[] { 1, 1, 0, 1 });
		System.out.println("-----------------------------------");
		cs.longestSubarray(new int[] { 0, 1, 1, 1, 0, 1, 1, 0, 1 });
	}

	public int longestSubarray(int[] nums) {
		int maxlength = 0;
		boolean isfirstZero = false;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0 && !isfirstZero) {
				isfirstZero = true;
			} else if (nums[i] == 0 && isfirstZero) {
//				maxlength 
				System.out.println(">>" + i);
			} else {
				maxlength = i;
			}
		}

		if (maxlength == nums.length - 1) {
			return maxlength;
		}

		System.out.println(maxlength);
		return 0;
	}
}
