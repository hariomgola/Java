package Java_Leet_Code_Easy;

import java.util.Arrays;

public class _88_merge_sorted_array {

	public static void main(String[] args) {
		_88_merge_sorted_array cs = new _88_merge_sorted_array();
		cs.merge(new int[] {1,2,3,0,0,0}, 3, new int[] {2,5,6}, 3);
	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		for(int i=m;i<n+m;i++) {
			nums1[i] = nums2[n+m-i-1];
		}
		Arrays.sort(nums1);
	}

}
