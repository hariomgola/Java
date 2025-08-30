package Java_Question;

import java.util.Arrays;

public class hclTech_Question {

	public static void main(String[] args) {
		// array -> multiple number 5/6 and 2,3 dublicate dublicate number i need to
		// remove
		//  string array - > first letter start with chennai,dubai
		Arrays.stream(new int[] {1,2,3,4,5,6,7,8,12,3,4,5}).distinct().forEach(_data->{
			System.out.println(_data);
		});

		String[] data = new String[] { "india", "china", "itely", "indonesia", "usa", "england", "japan", "cyibras" };
		String startWith = "i";

		Arrays.stream(data).filter(_data -> _data.split("")[0].equalsIgnoreCase("c")).forEach(_data -> {
			System.out.println(_data);
		});

	}

}
