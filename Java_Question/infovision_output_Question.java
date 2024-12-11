package Java_Question;

public class infovision_output_Question {
	int ivalue;
	String svalue;

	infovision_output_Question(int ivalue) {
		this.ivalue = ivalue;
	}

	infovision_output_Question(int ivalue, String svalue) {
		this(ivalue); // important point to note
		this.svalue = svalue;
	}

	public String toString() {
		return ivalue + svalue;
	}

	public void printValue() {
		System.out.println(ivalue + " - " + svalue);
	}

	public static void main(String[] args) {
		infovision_output_Question cs = new infovision_output_Question(101, "X");
		cs.printValue();
		System.out.println(cs.toString());
	}

}
