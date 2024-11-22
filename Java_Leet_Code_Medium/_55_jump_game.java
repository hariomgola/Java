package Java_Leet_Code_Medium;

import java.util.Arrays;
import java.util.HashMap;

public class _55_jump_game {

	public static void main(String[] args) {
		String data = "java".toLowerCase();
		HashMap<String, Integer> _hs = new HashMap<String, Integer>();

		Arrays.stream(data.split("")).forEach(_data -> {
			_hs.put(_data, _hs.get(_data) == null ? 1 : _hs.get(_data) + 1);
		});

		for (String s : _hs.keySet()) {
			System.out.println(s + " = " + _hs.get(s));
		}

	}

}
