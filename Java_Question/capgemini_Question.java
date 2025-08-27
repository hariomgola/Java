package Java_Question;

import java.lang.reflect.Array;

public class capgemini_Question {

	public static void main(String[] args) {
		/**
		 * Given an array of integers nums and an integer target, 
		 * return indices of the two numbers such that they add up to target. 
		 * You may assume that each input would have exactly one solution, 
		 * and you may not use the same element twice.
		 */
		
		// Input: nums = [2,7,11,15], target = 9
		// Output: [0,1]
		
		Integer[] nums = new Integer[] {2,7,11,15};
		int target = 13;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==target ) {
					Integer[] _finalOutput =  new Integer[] {i,j};
					System.out.println(i+","+j);
					break;
				}
			}
		}

	}

}
