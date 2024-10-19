package Java_Leet_Code_Easy;

public class _67_add_binary {

	public static void main(String[] args) {
		_67_add_binary cs = new _67_add_binary();
		cs.addBinary("11", "1"); // 100
		cs.addBinary("1000110", "11"); // 1001001
		cs.addBinary("110", "111"); // 1101
		cs.addBinary("100001", "10010"); // 110011
		cs.addBinary("110", "11"); // 1001
		cs.addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110", "111"); // 10100000100100110110010000010101111011011001101110111111111101000000101111010101
	}

	public String addBinary(String a, String b) {
		a = new StringBuffer(a).reverse().toString();
		b = new StringBuffer(b).reverse().toString();
		int lengthValue = a.length() >= b.length() ? b.length() : a.length();
		String stringValue = a.length() > b.length() ? a.substring(lengthValue) : b.substring(lengthValue);
		int carryValue = 0;
		String _final = "";

		for (int i = 0; i < lengthValue; i++) {
			int _temp = Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(i)) + carryValue;
			carryValue = _temp > 2 ? 1 : _temp > 1 ? 1 : 0;
			_final += _temp > 2 ? 1 : _temp > 1 ? 0 : _temp > 0 ? 1 : 0;
		}

		if (stringValue.length() > 0) {
			for (int i = 0; i < stringValue.length(); i++) {
				int _temp = Character.getNumericValue(stringValue.charAt(i)) + carryValue;
				carryValue = _temp > 2 ? 1 : _temp > 1 ? 1 : 0;
				_final += _temp > 2 ? 1 : _temp > 1 ? 0 : _temp > 0 ? 1 : 0;
			}
		}

		if (carryValue > 0) {
			_final += carryValue > 0 ? 1 : "";
		}

		System.out.println("Final Result - " + new StringBuffer(_final).reverse());
		return new StringBuffer(_final).reverse().toString();
	}

}
