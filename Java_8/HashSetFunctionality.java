package Java_8;

import java.util.HashSet;

public class HashSetFunctionality {

	public static void main(String[] args) {
		HashSet<String> cars = new HashSet<String>();
		cars.add("Suzuki");
		cars.add("Tata");
		cars.add("Mahindra");
		cars.add("BMW");
		System.out.println("|> " + cars);

		cars.contains("BMW");
		cars.remove("Tata");
		cars.size();
		for (String i : cars) {
			System.out.println(i);
		}
		cars.clear();
	}

}
