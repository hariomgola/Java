package Java_Question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Stream;

public class sync_question {
	public static void main(String[] args) {
		HashMap<Integer, String> _hs = new HashMap<Integer, String>();
		HashMap<String, Integer> _hsTemp = new HashMap<String, Integer>();
		int largestValue = 0;
		_hs.put(1, "Ram");
		_hs.put(2, "Sham");
		_hs.put(3, "Sham");
		_hs.put(4, "Sham");
		_hs.put(5, "Sita");
		_hs.put(6, "Sita");
		_hs.put(7, "Ram");
		_hs.put(8, "Ram");
		_hs.put(9, "Hari");
		_hs.put(10, "Hari");
		_hs.put(11, "Hari");

		for (int i : _hs.keySet()) {
			_hsTemp.put(_hs.get(i), _hsTemp.get(_hs.get(i)) == null ? 1 : _hsTemp.get(_hs.get(i)) + 1);
			if (_hsTemp.get(_hs.get(i)) > largestValue) {
				largestValue = _hsTemp.get(_hs.get(i));
			}
		}
		printFunction(_hsTemp, 1, largestValue);

	}

	public static void printFunction(HashMap<String, Integer> _hs, int iteration, int largestValue) {
		boolean isFound = false;
		if (iteration <= 3) {
			for (String i : _hs.keySet()) {
				if (_hs.get(i) == largestValue) {
					isFound = true;
					System.out.println(i + "  " + _hs.get(i));
					_hs.remove(i);
					break;
				}
			}
			printFunction(_hs, isFound ? iteration + 1 : iteration, isFound ? largestValue : largestValue - 1);
		}
	}
}
