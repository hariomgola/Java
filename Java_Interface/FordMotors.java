package Java_Interface;

public class FordMotors implements carfactory {
	public static void main(String[] args) {
		carfactory.run();
	}

	public void carHonk() {
		System.out.println(" - Car horn is blown - ");
	}

}
