package Java_Question;

import java.util.HashMap;
import java.util.HashSet;

public class HCL_Heirachy {
	// name,designation,heirachical
	String name;
	String designation;
	static HashMap<String, HashSet<String>> _hash = new HashMap<String, HashSet<String>>();
	// graph ??

	/**
	 * Director - [m1,m2,m3] [m1] [m2] [m3] [se1,se2] [se1,se2] [se1,se2]
	 */

	public static void printHeirachy(String input_name) {
		_hash.get(input_name);
	}

	public static void iterator(String input_name) {
		HashSet<String> temp_set = _hash.get(input_name);
		if (temp_set.size() == 0) {
			return;
		} else {
			for (String temp_employee : temp_set) {
				iterator(temp_employee);
			}
		}
	}
}
