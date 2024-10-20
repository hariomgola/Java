package Java_Leet_Code_Medium;

public class _7_reverse_integer {

	public static void main(String[] args) {
		_7_reverse_integer cs = new _7_reverse_integer();
		cs.reverse(123);
		cs.reverse(-123);
		cs.reverse(120);
		cs.reverse(1534236469);
	}

	public int reverse(int x) {
		boolean isNegative = false;
		int _finalNum = 0;
		// Negative Number Checking
		if (x < 0) {
			isNegative = true;
			x = -x;
		}
		// reversing number
		while (x > 0) {
			_finalNum = _finalNum * 10 + x % 10;
			x = x / 10;
		}
		System.out.println(">>>" + _finalNum);

		return isNegative ? -_finalNum : _finalNum;
	}

}
