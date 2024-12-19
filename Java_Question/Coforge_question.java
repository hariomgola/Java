package Java_Question;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

class empl {
	public int id;
	public String name;
	public double salary;

	public empl(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "empl [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class Coforge_question {
	public static List<empl> _empl = new ArrayList<empl>();
	static {
		_empl.add(new empl(1, "Hari", 10000));
		_empl.add(new empl(2, "John Doe", 15000));
		_empl.add(new empl(3, "Jane Smith", 20000));
		_empl.add(new empl(4, "Alice Green", 10000));
		_empl.add(new empl(5, "Bob Brown", 20000));
		_empl.add(new empl(6, "Charlie White", 15000));
		_empl.add(new empl(7, "David Black", 40000));
		_empl.add(new empl(8, "Eva Blue", 45000));
		_empl.add(new empl(9, "Frank Gold", 50000));
		_empl.add(new empl(10, "Grace Silver", 55000));
	}

	public static void main(String[] args) {
		Coforge_question cs = new Coforge_question();
		cs.streamOpertaion();
		cs.returntheMap("HariomGola".toLowerCase());
		cs.returntheMap("ararararahhh".toLowerCase());
	}

	/*
	 * Real Question code start from here only
	 */
	public void streamOpertaion() {
		System.out.println(" |> Stream, question 1 execution is going on *********");

		// Arrange the list into desc order
		_empl.stream().sorted(Comparator.comparingDouble(empl::getSalary).reversed()).forEach(_data -> {
			System.out.println(" >> " + _data.toString());
		});

		// get the third height salary of an employee
		_empl.stream().collect(Collectors.groupingBy(emp -> emp.getSalary())).entrySet().stream()
				.sorted((entry1, entry2) -> Double.compare(entry1.getKey(), entry2.getKey())).skip(2).limit(1)
				.forEach(_data -> {
					System.out.println("       " + _data.toString());
				});
	}

	/*
	 * Return the map which has number of character repeater
	 */
	public HashMap<String, Integer> returntheMap(String data) {
		String[] _data = data.split("");
		HashMap<String, Integer> _hs = new HashMap<String, Integer>();
		for (int i = 0; i < _data.length; i++) {
			_hs.put(_data[i], _hs.get(_data[i]) == null ? 1 : _hs.get(_data[i]) + 1);
		}
		System.out.println(" |> - " + _hs.toString());
		return _hs;
	}

}
