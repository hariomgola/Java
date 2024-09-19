package Java_8;

class ThreadHelper extends Thread {
	public void run() {
		System.out.println("This Code is Running in a Thread With Class ThreadHelper");
	}
}

class ThreadHelper2 implements Runnable {
	public void run() {
		System.out.println("This Code is Running in a Thread With Class ThreadHelper2");
	}
}

public class ThreadFunctionality {
	public static void main(String[] args) {
		ThreadHelper thread = new ThreadHelper();
		thread.start();
		System.out.println("This Code is outside of a Thread");
	}
}

/**
 * public class ThreadFunctionality { public static void main(String[] args) {
 * ThreadHelper2 threadHelper = new ThreadHelper2(); Thread thread = new
 * Thread(threadHelper); thread.start(); System.out.println("This Code is
 * outside of a Thread"); } }
 */
