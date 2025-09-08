package Java_8;

import java.util.Arrays;

public class _question_data {
	/**
	 * 
	 */
	public static void main(String[] args) {
		String[] data = { "abc", "2", "xyz", "1.23", "5", "8" };

//		int _data = Integer.parseInt(data[0]);

		Arrays.stream(data).filter(_data -> {
			try {
				int _convertedData = Integer.parseInt(_data);
				if (_convertedData % 2 == 0) {
					return true;
				}
				return false;
			} catch (Exception e) {
				return false;
			}
		}).forEach(_data -> {
			System.out.println(_data);
		});

	}
}
