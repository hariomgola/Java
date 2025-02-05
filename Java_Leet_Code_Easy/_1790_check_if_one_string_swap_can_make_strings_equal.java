package Java_Leet_Code_Easy;

import java.util.HashMap;

public class _1790_check_if_one_string_swap_can_make_strings_equal {

	public static void main(String[] args) {
		_1790_check_if_one_string_swap_can_make_strings_equal cs = new _1790_check_if_one_string_swap_can_make_strings_equal();
		cs.areAlmostEqual("bank", "kanb");

	}

	public boolean areAlmostEqual(String s1, String s2) {
		if (s1.length() == s2.length()) {
			String[] arr1 = s1.split("");
			String[] arr2 = s2.split("");
			HashMap<Integer, String> _hs = new HashMap<Integer, String>();
			for (int i = 0; i < arr1.length; i++) {
				if (!arr1[i].equals(arr2[i])) {
					_hs.put(i, arr2[i]);
				}
			}

			if (_hs.size() == 0 || _hs.size() == 2) {
				Integer _temp = null;
				String _stemp = null;
				for (Integer key : _hs.keySet()) {
					if (_temp == null) {
						_temp = key;
						_stemp = _hs.get(key);
					} else {
						arr2[key] = _stemp;
						arr2[_temp] = _hs.get(key);
					}
				}
			}
			if (String.join("", arr1).equals(String.join("", arr2))) {
				return true;
			}
		}
		return false;
	}

}
