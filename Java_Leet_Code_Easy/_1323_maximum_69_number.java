package Java_Leet_Code_Easy;

public class _1323_maximum_69_number {

	public static void main(String[] args) {
		_1323_maximum_69_number cs = new _1323_maximum_69_number();
		cs.maximum69Number(9669);
	}

	public int maximum69Number(int num) {
		int digits = (int) Math.log10(num) + 1;
		int maxValue = ((int) Math.pow(10, digits) - 1) - num;
		int power = (int) Math.pow(10, (int) Math.log10(maxValue));
		int result = (maxValue / power) * power;
		return num+result;
	}

}
