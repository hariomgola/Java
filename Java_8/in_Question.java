package Java_8;

public class in_Question {

	public static void main(String[] args) {
		// code target value
		// target value of 7;
		int[] _data = { 2, 5, 1, 5, 6, 7, 12, 4, 3, 0,5 };
		int _target = 7;
		for (int i = 0; i < _data.length; i++) {
			inner: for (int j = i + 1; j < _data.length; j++) {
				if (_data[i] + _data[j] == _target) {
					System.out.println(i + "=" + _data[i] + " " + j + "=" + _data[j]);
					break inner;
				}
			}
		}

	}

}
