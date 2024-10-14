package Java_Leet_Code_Easy;

public class add_binary {

	public static void main(String[] args) {
		add_binary cs = new add_binary();
		cs.addBinary("11", "1");
		cs.addBinary("1000110", "11"); // 70 // 3 // 1001001 - reverse - 1001001
		cs.addBinary("110", "111"); // 1101
		cs.addBinary("100001", "10010"); // 11001
		cs.addBinary("110", "11"); // 1001
		cs.addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110", "111");
	}

	public String addBinary(String a, String b) {
		a = new StringBuffer(a).reverse().toString();
		b = new StringBuffer(b).reverse().toString();
		String _longer = a.length() > b.length() ? a : b;

		String _final = "";
		int _temp = 0;

		// Logic for iterating the value with length same
		for (int i = 0; i < (a.length() >= b.length() ? b.length() : a.length()); i++) {
			int _localTemp = Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(i) + _temp);
			if (_localTemp > 0) {
				if (_localTemp > 1) {
					if (_localTemp > 2) {
						_final += 1;
						_temp = 1;
					} else {
						_final += 0;
						_temp = 1;
					}
				} else {
					_final += 1;
					_temp = 0;
				}
			} else {
				_final += 0;
				_temp = 0;
			}
		}

		System.out.println("Final Result - " + new StringBuffer(_final).reverse() + "\n");
		return "";
	}

}
