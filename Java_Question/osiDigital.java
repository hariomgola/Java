package Java_Question;

import java.util.Arrays;
import java.util.List;

public class osiDigital {
	public static void main(String[] args) {
		/**
		 * Count the number of strings in a list that start with "A" and have length >
		 * 3. List<String> names = Arrays.asList("Apple", "Ant", "Ball", "Angel"); 2
		 * 
		 */
		List<String> names = Arrays.asList("Apple", "Ant", "Ball", "Angel");
		long countValue = names.stream().filter(_data -> {
			return _data.toUpperCase().split("A")[0] == "" && _data.length() > 3 ? true : false;
		}).count();
		
		System.out.println(">>>>>>>"+countValue);
		
	}
}
