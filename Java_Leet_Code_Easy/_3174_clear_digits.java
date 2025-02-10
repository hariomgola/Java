package Java_Leet_Code_Easy;

import java.util.Stack;

public class _3174_clear_digits {

	public static void main(String[] args) {
		_3174_clear_digits cs = new _3174_clear_digits();
		cs.clearDigits("abc");
		cs.clearDigits("cb34");
	}

	public String clearDigits(String s) {
		String[] arr = s.split("");
		Stack<String> stk = new Stack<String>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].matches("\\d")) {
				if (!stk.isEmpty()) {
					stk.pop();
				}
			} else {
				stk.push(arr[i]);
			}
		}
		return stk.stream().reduce("", (a, b) -> a + b);
	}

}
