package Java_8;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

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
		// ------- Thread Example -------
		// threadExample();
		streamExample();
	}

	public static void javaAttributeExample() {
		_logicalCode cs = new _logicalCode();
		cs.sampleValue = 25;
		// System.out.println(this.sampleValue);
		System.out.println(cs.sampleValue);
	}

	public static void virtualThreadExample() {
		Thread.startVirtualThread(() -> {
			System.out.println("Hello this is a virtual thread!");
		});
	}

	public static void threadExample() {
		// Callable Example
		ExecutorService executor = Executors.newSingleThreadExecutor();

		Callable<Integer> task = () -> {
			Thread.sleep(5000);
			return 42;
		};

		System.out.println("-- Calling the executor service --");
		Future<Integer> future = executor.submit(task);
		System.out.println("-- Calling the executor service End --");
		try {
			Integer result = future.get(); // Here the thread with execute and wait
			System.out.println("Value from the callable Thread " + result);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		} finally {
			executor.shutdown();
		}

		// Runnable Example - Execute on a main thread
		Runnable runnableTask = () -> {
			try {
				Thread.sleep(1000);
				System.out.println("Hi I am a task from runnable");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};
		runnableTask.run();

		new Thread(runnableTask).start(); // Execute asynchronously
	}

	public static void streamExample() {

	}

}
