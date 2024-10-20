package Java_Leet_Code_Medium;

public class _6_zigzag_conversion {

	public static void main(String[] args) {
		_6_zigzag_conversion cs = new _6_zigzag_conversion();
		// n = 1 , r=1-1
		// n = 2 , r=2-1
		// n = 3 , r=3-1
		// n = 4 , r=4-1
		cs.convert("PAYPALISHIRING", 3);
	}

	public String convert(String s, int numRows) {
		System.out.println((s.charAt(0)+"") + (s.charAt(3+1)) + (s.charAt(3+3+2)) + (s.charAt(3+3+3+3)));
		System.out.println((s.charAt(1)+"") + (s.charAt(3)) + (s.charAt(3+3-1)));
		return "";
	}

}
