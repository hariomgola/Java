package Java_Leet_Code_Easy;

import java.util.Stack;

public class _20_valid_parentneses {

	public static void main(String[] args) {
		_20_valid_parentneses cs = new _20_valid_parentneses();
		System.out.println(cs.isValid("()[]{}"));
		System.out.println(cs.isValid("(])"));
	}

	public boolean isValid(String s) {
		if (s.length() % 2 != 0) {
			return false;
		}
		Stack<Character> _stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char _char = s.charAt(i);
			if (_char == '(' || _char == '[' || _char == '{') {
				_stack.push(_char);
			} else if (!_stack.isEmpty() && ((_stack.peek() == '(' && _char == ')')
					|| (_stack.peek() == '[' && _char == ']') || (_stack.peek() == '{' && _char == '}'))) {
				_stack.pop();
			} else {
				return false;
			}
		}
		return _stack.isEmpty();
	}
}
