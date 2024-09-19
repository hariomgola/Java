package Java_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListFunctionality {

	public static void main(String[] args) {
		List<String> cars = new ArrayList<String>();
		cars.add("Suzuki");
		cars.add("Tata");
		cars.add("Mahindra");
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(i + " car - " + cars.get(i));
		}
		Collections.sort(cars);
		for (String i : cars) {
			System.out.println("car - " + i);
		}
	}

}
