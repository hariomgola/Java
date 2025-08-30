package Java_Question;

public class techMahindra_Final_Question {
	static final String lock1 = "LockA";
	static final String lock2 = "LockB";

	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			synchronized (lock1) {
				System.out.println("Thread 1 locked LockA");
				try {
					Thread.sleep(50);
				} catch (Exception e) {
				}
				synchronized (lock2) {
					System.out.println("Thread 1 locked LockB");
				}
			}
		});

		Thread t2 = new Thread(() -> {
			synchronized (lock1) {
				System.out.println("Thread 2 locked LockB");
				try {
					Thread.sleep(50);
				} catch (Exception e) {
				}
				synchronized (lock2) {
					System.out.println("Thread 2 locked LockA");
				}
			}
		});

		t1.start();
		t2.start();
	}
}
