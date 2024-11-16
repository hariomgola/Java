package Java_Thread;

public class Thread_Even_Odd {
	volatile static int start_Value = 1;
	int limit;

	public Thread_Even_Odd(int limit) {
		this.limit = limit;
	}

	public static void main(String[] args) {
		Thread_Even_Odd thread_Even_Odd = new Thread_Even_Odd(10);

		Thread t_1 = new Thread(new Runnable() {
			@Override
			public void run() {
				thread_Even_Odd.printEven();
			}
		});
		t_1.setName("Odd");

		Thread t_2 = new Thread(new Runnable() {
			@Override
			public void run() {
				thread_Even_Odd.printOdd();
			}
		});
		t_2.setName("Even");

		// Executing the thread
		t_1.start();
		t_2.start();

	}

	public synchronized void printEven() {
		while (start_Value <= limit) {
			if (start_Value % 2 == 0) {
				System.out.println("|=> " + Thread.currentThread().getName() + " Value => " + start_Value);
				start_Value++;
				notifyAll();
			} else {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public synchronized void printOdd() {
		while (start_Value <= limit) {
			if (start_Value % 2 == 1) {
				System.out.println("|-> " + Thread.currentThread().getName() + " Value => " + start_Value);
				start_Value++;
				notifyAll();
			} else {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
