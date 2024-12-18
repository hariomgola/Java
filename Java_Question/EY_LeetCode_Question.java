package Java_Question;

public class EY_LeetCode_Question {

	public static void main(String[] args) {
		EY_LeetCode_Question cs = new EY_LeetCode_Question();
		cs.stringQuestionCheck();

	}

	public void stringQuestionCheck() {
		String s1 = new String("hello world");
		String s2 = s1.toUpperCase();
		String s3 = s1.toLowerCase();

		System.out.println(s1 == s2); // true
		System.out.println(s1 == s3); // false
		System.out.println(new String("hello world") == "hello world");
	}
	
	public void leetCodeQuestion() {
		// 209
		// 1475
	}

}
