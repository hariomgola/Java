package Java_Leet_Code_Easy;

public class _9_palindrome_number {

	public static void main(String[] args) {
		_9_palindrome_number pn = new _9_palindrome_number();
		pn.isPalindrome(1213);
	}

	public boolean isPalindrome(int x) {
		if (x < 0) {
			return false;
		}
		
		int actualValue = x;
		int reverseNumber = 0;
		while (actualValue > 0) {
			reverseNumber = (reverseNumber * 10) + actualValue % 10;
			actualValue = actualValue / 10;
		}

		return reverseNumber == x ? true : false;
	}

}
