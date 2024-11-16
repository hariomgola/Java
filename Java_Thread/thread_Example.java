package Java_Thread;

public class thread_Example extends Thread {
	private static int amount = 0;

	public static void main(String[] args) {
		thread_Example te = new thread_Example();
		te.start();
		// Here Waiting for the thread to finish
		while (te.isAlive()) {
			System.out.println("Waiting...");
		}
		System.out.println("|> Before Increment main function " + amount);
		amount++;
		System.out.println("|> After Increment main function " + amount);
	}

	public void run() {
		amount++;
		System.out.println("|> Thread run Function is Running " + amount);
	}

}
