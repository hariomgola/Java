package Java_Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Given an array arr of size n which contains elements in range from 0 to n-1, 
 * you need to find all the elements occurring more than once in the given array. 
 * Return the answer in ascending order. 
 * If no such element is found, return list containing [-1]. 
 * 
 * 
Input: arr[] = {0,3,1,2}, n = 4 Output: -1 
Explanation: There is no repeating element in the array. 
Therefore output is -1.

Input: arr[] = {2,3,1,2,3}, 
n = 5 Output: 2 3 
Explanation: 2 and 3 occur more than once in the given array.
 */

public class infovision_question {

	public static void main(String[] args) {
		infovision_question cs = new infovision_question();
		cs.checkForDublicate(new int[] {0,3,1,2});
		cs.checkForDublicate(new int[] {2,3,1,2,3});
	}
	
	public ArrayList<Integer> checkForDublicate(int[] _input) {
		ArrayList<Integer> _as = new ArrayList<Integer>();
		HashMap<Integer, Integer> _hs = new HashMap<Integer, Integer>();
		for(int i=0;i<_input.length;i++) {
			_hs.put(_input[i], _hs.get(_input[i]) == null ? 1 : _hs.get(_input[i])+1);
			if(_hs.get(_input[i]) > 1) {
				_as.add(_input[i]);
			}
		}
		if(_as.size()==0) {
			_as.add(-1);
		}
		
		System.out.println(_as.toString());
		return _as;
	}

}
