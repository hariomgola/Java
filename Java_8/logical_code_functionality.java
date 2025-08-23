package Java_8;

public class logical_code_functionality {

	public static void main(String[] args) throws InterruptedException {
		virtualThreadExample();
		Thread.sleep(3000);
	}
	
	public static void virtualThreadExample() {
		Thread.startVirtualThread(()->{
			System.out.println("Hello this is a virtual thread!");
		});
	}

}
