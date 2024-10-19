package Java_Leet_Code_Easy;

import java.util.HashMap;

public class _13_romon_to_integer {

	public static void main(String[] args) {
		_13_romon_to_integer _ri = new _13_romon_to_integer();
		System.out.println(_ri.romanToInt("MCMXCIV"));

	}

	public int romanToInt(String s) {
		HashMap<Character, Integer> _hs = new HashMap<Character, Integer>() {
			{
				put('I', 1);
				put('V', 5);
				put('X', 10);
				put('L', 50);
				put('C', 100);
				put('D', 500);
				put('M', 1000);
			}
		};
		int characterLength = s.length() - 1;
		int _returnValue = _hs.get(s.charAt(characterLength));
		for (int i = characterLength; i > 0; i--) {
			if (_hs.get(s.charAt(i - 1)) > _hs.get(s.charAt(i))) {
				_returnValue += _hs.get(s.charAt(i - 1));
			} else {
				_returnValue -= _hs.get(s.charAt(i - 1));
			}
		}
		return _returnValue;
	}

}
