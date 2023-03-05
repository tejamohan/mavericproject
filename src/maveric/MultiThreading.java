package maveric;

public class MultiThreading extends Thread {

	public void run() {
		System.out.println("Thread 1 is running");
		 System.out.println("Running Thread : "
                 + currentThread().getName());
         System.out.println("Running Thread Priority : "
                 + currentThread().getPriority());
	}
	public void show() {

		System.out.println("Thread 2");
	}
  static class MyRunnable implements Runnable{

	// Main method


	@Override
	public void run() {
	System.out.println("Thread 2 is running");
		
	}
	public static void main(String[] args) {

		MultiThreading obj1 = new MultiThreading();
		MultiThreading obj2 = new MultiThreading();
		
		 obj1.setPriority(Thread.NORM_PRIORITY);
	        obj2.setPriority(Thread.MIN_PRIORITY);
		
		MyRunnable mr=new MyRunnable();
		Thread th=new Thread(mr);
		th.setPriority(Thread.MAX_PRIORITY);
        System.out.println(obj1.isDaemon());
        obj1.setDaemon(true);
        System.out.println(obj1.isDaemon());
		
		th.start();

		obj1.start();

		obj2.start();
	}
	
}
}
