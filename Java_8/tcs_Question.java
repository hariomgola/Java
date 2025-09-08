package Java_8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class emp {
	private int id;
	private String name;
	private String designation;
	private int salary;

	public emp(int id, String name, String designation, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "emp [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}

}

public class tcs_Question {

	public static void main(String[] args) {
		// Need the second heighten salary for the designation se4
		List<emp> _ls = new ArrayList<emp>();
		_ls.add(new emp(10, "hari", "SE3", 10000));
		_ls.add(new emp(2, "hari2", "SE2", 2000));
		_ls.add(new emp(3, "hari3", "SE4", 3000));
		_ls.add(new emp(6, "hari6", "SE4", 6000));
		_ls.add(new emp(5, "hari5", "SE5", 5000));
		_ls.add(new emp(4, "hari4", "SE4", 4000));

		Optional<Integer> _opt = _ls.stream().filter(_data -> _data.getDesignation().equals("SE4"))
				.sorted(Comparator.comparingInt(_data -> _data.getSalary())).map(_data -> _data.getSalary())
				.sorted(Comparator.reverseOrder()).skip(1).findFirst();

		if (_opt.get() != null) {
			System.out.println(_opt.get());
		}

	}

}
