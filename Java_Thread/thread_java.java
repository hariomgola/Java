package Java_Thread;

class ThreadHelper extends Thread {
	public void run() {
		// It will run once the code execution is stopped in main
		System.out.println("|> This Code is Running using ** extended Thread **");
	}
}

class RunnableHelper implements Runnable {
	// It run when the code execution start
	public void run() {
		System.out.println("|> This Code is Running using a ** implements Runnable **");
	}
}

public class thread_java {
	String output = """
			** Main Code Start **
			** Main Code End **


			** Main Code Start **
			|> This Code is Running using ** extended Thread **
			** Main Code End **


			|> This Code is Running using a ** implements Runnable **
					""";

	public static void main(String[] args) {
		// using extends
		System.out.println("** Main Code Start **");
		ThreadHelper threadHelper = new ThreadHelper();
		threadHelper.start();
		System.out.println("** Main Code End **\n\n");
		// using runnable
		System.out.println("** Main Code Start **");
		RunnableHelper runnableHelper = new RunnableHelper();
		Thread threadObject = new Thread(runnableHelper);
		threadObject.start();
		System.out.println("** Main Code End **\n\n");
	}

}
