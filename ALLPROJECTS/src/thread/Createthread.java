package thread;

class ThreadRunnable implements Runnable {
	public void run() {
		System.out.println("Thread is running....");
	}
}

public class Createthread {

	public static void main(String[] args) {
		Runnable runnableObj = new ThreadRunnable();
		Thread t1 = new Thread(runnableObj);
		t1.start();
	}
}