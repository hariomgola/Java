package Java_Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

class emp {
	int id;
	String name;
	double salary;
	String dep;

	public emp(int id, String name, double salary, String dep) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dep = dep;
	}

	@Override
	public String toString() {
		return "emp [id=" + id + ", name=" + name + ", Salary=" + salary + ", dep=" + dep + "]";
	}
}

/**
 * 4 employees top salary employee for each of the department where the
 * department have the top salary;
 */
public class globalLogic_java {
	public static void main(String[] args) {
		List<emp> _ls = new ArrayList<emp>();
		_ls.add(new emp(1, "a", 10, "d1"));
		_ls.add(new emp(2, "b", 20, "d2"));
		_ls.add(new emp(3, "c", 30, "d3"));
		_ls.add(new emp(4, "d", 40, "d1"));
		_ls.add(new emp(5, "e", 50, "d2"));
		_ls.add(new emp(6, "f", 60, "d3"));
		_ls.add(new emp(7, "g", 70, "d1"));

		Map<String, List<emp>> _depList = _ls.stream().collect(Collectors.groupingBy(_data -> _data.dep));

//		Map<Object, Object> _topEmp = _ls.stream().collect(
//				Collectors.toMap(e -> e.dep, e -> e, BinaryOperator.maxBy()));

		for (String s : _depList.keySet()) {
			System.out.println(s + "---" + _depList.get(s));
		}
	}
}
