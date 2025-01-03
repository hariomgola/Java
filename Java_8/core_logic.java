package Java_8;

public class core_logic {

	public static void main(String[] args) {
		stringQuestionCheck();
		System.out.println(checktryBlock());
	}

	public static void stringQuestionCheck() {
		String data1 = "String0";
		String data2 = "String0";
		String data3 = new String("String0");
		String data4 = new String("String0");
		String data5 = data4.intern();

		System.out.println(data1 == data2);
		System.out.println(data2 == data3);
		System.out.println(data3 == data4);
		System.out.println(data4 == data5);
		System.out.println(data5 == data1);
		System.out.println(data5);
	}

	public static int checktryBlock() {
		try {
			return 10;
		} finally {
			return 20;
		}
	}

}
