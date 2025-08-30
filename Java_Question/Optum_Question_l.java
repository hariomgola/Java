package Java_Question;

import java.util.ArrayList;
import java.util.Arrays;

class twoArray {
	private int f1;
	private int f2;

	public twoArray(int f1, int f2) {
		super();
		this.f1 = f1;
		this.f2 = f2;
	}
}

public class Optum_Question_l {

	public static void main(String[] args) {
		int arr[] = { 2, 6, 8, 4, 5, 7, -1, -2, 1 };
		Arrays.sort(arr);
		System.out.println(arr.toString());
		int inputData = 6;
		// output - [{2,4},{7,-1,{5,1},{8,-2}]
		ArrayList<twoArray> _final = new ArrayList<twoArray>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1 + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == inputData) {
					_final.add(new twoArray(arr[i], arr[j]));
				}
			}
		}
	}

}
