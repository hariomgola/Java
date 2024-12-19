package Java_Leet_Code_Interview150;

import java.util.Arrays;

public class _88_merge_sorted_array {
	// Successed
	public static void main(String[] args) {
		_88_merge_sorted_array cs = new _88_merge_sorted_array();
		cs.merge(new int[] { 1, 2, 3, 0, 0, 0 }, 3, new int[] { 2, 5, 6 }, 3);
		cs.merge(new int[] { 1 }, 1, new int[] {}, 0);
		cs.merge(new int[] { 0 }, 0, new int[] { 1 }, 1);
	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		System.out.println(" *** ");
		// inserting the element
		for (int i = 0; i < n; i++) {
			nums1[i + m] = nums2[i];
		}

		// sorting an array over here
		for (int i = 1; i < nums1.length; i++) {
			int insertIndex = i;
			int currentValue = nums1[i];
			int j = i - 1;

			while (j >= 0 && nums1[j] > currentValue) {
				nums1[j + 1] = nums1[j];
				insertIndex = j;
				j--;
			}
			nums1[insertIndex] = currentValue;
		}

	}

}
