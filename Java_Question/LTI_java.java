package Java_Question;

public class LTI_java {

	public static void main(String[] args) {
		LTI_java cs = new LTI_java();
		int[] arr = { 1, 2, 9, 8, 7, 11, 12, 14, 16, 10 ,11};
		System.out.print(cs.findtheMissingIndex(arr, 16));

	}

	public int findtheMissingIndex(int[] _arr, int findValue) {
		if (_arr.length % 2 == 0) {
			for (int i = 0; i < _arr.length / 2; i++) {
				if (_arr[i] == findValue) {
					return i;
				} else if (_arr[_arr.length / 2 + i] == findValue) {
					return _arr.length / 2 + i;
				}
			}
		} else {
			for (int i = 0; i < _arr.length + 1 / 2; i++) {
				if (i < _arr.length && _arr[i] == findValue) {
					return i;
				} else if (_arr.length + 1 / 2 + 1 < _arr.length && _arr[_arr.length / 2 + i] == findValue) {
					return _arr.length / 2 + i;
				}
			}
		}
		return 0;
	}

}
