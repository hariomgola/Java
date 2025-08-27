package Java_8;

class vehicle {
	protected String brand = "Maruti";

	public void run() {
		System.out.println(brand + " is Running");
	}
}

sealed class truck permits tataTruck {
}

non-sealed class tataTruck extends truck {
}

// OOPS Concept
public class _logicalCode {
	int sampleValue = 10;

	public static void main(String[] args) throws InterruptedException {
		// ------- Oops -------
		// javaAttributeExample();
		// ------- Virtual Thread -------
		// virtualThreadExample();
		// Thread.sleep(3000);
	}

	public void javaAttributeExample() {
		_logicalCode cs = new _logicalCode();
		cs.sampleValue = 25;
		System.out.println(this.sampleValue);
		System.out.println(cs.sampleValue);
	}

	public static void virtualThreadExample() {
		Thread.startVirtualThread(() -> {
			System.out.println("Hello this is a virtual thread!");
		});
	}

}
