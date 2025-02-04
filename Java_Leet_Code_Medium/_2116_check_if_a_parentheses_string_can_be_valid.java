package Java_Leet_Code_Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class _2116_check_if_a_parentheses_string_can_be_valid {

	public static void main(String[] args) {
		_2116_check_if_a_parentheses_string_can_be_valid cs = new _2116_check_if_a_parentheses_string_can_be_valid();
//		cs.canBeValid("))()))", "010100");
//		cs.canBeValid("()()", "0000");
//		cs.canBeValid(")", "0");
//		cs.canBeValid("(()())", "111111");
//		cs.canBeValid("())(()(()(())()())(())((())(()())((())))))(((((((())(()))))(",
//				"100011110110011011010111100111011101111110000101001101001111");
		cs.canBeValid("((()(()()))()((()()))))()((()(()", "10111100100101001110100010001001");
	}

	public boolean canBeValid(String s, String locked) {
		class Pair {
			String key;
			String value;

			public Pair(String key, String value) {
				super();
				this.key = key;
				this.value = value;
			}
		}

		String[] s_arr = s.split("");
		String[] l_arr = locked.split("");

		for (int i = 0; i < s_arr.length; i++) {

		}

		return false;
	}

}
