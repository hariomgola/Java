package Java_8;

import java.util.Arrays;

public class calculator {

	public static void main(String[] args) {
		calculator cs = new calculator();
		cs.rdCalculator(16000, 25, 480000);
//		int starter = 0;
//		int[] _data = new int[] { 10400, 9600, 9200, 8800, 8400, 8000, 7200, 6600, 6000, 5600, 5200, 4400, 3600,
//				12000 };
//		for (int i = 0; i < _data.length; i++) {
//			starter = starter + _data[i];
//			System.out.println(i + "|> " + starter);
//		}

	}

	public int rdCalculator(int _monthlyValue, int _timePeriod, int _finalValue) {

		double interestRate = 0;
		interestRate = (2400 * (_finalValue - (_monthlyValue * _timePeriod)))
				/ (_monthlyValue * _timePeriod * (_timePeriod + 1));

		System.out.println(" |>  " + interestRate);

		return (int) interestRate;
	}

}
