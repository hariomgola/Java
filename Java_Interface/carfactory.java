package Java_Interface;

public interface carfactory {
	public default void carFeature() {
		System.out.println("Car has");
		System.out.println("        -> 4 Wheels");
		System.out.println("        -> Steering");
		System.out.println("        -> Music System");
	}

	public static String run() {
		return " - Car is Running on road - ";
	}

	public void carHonk();
}
