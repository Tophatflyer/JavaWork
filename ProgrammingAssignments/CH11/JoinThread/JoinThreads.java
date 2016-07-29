class JoinThreads{
	public static void main(String args[]){
		System.out.println("Main thread starting.");

		MyThread mt = new MyThread("Child #1");
		MyThread mt2 = new MyThread("Child #2");
		MyThread mt3 = new MyThread("Child #3");

		try{
			mt.thrd.join();
			System.out.println("Child #1 joined.");
			mt2.thrd.join();
			System.out.println("Child #2 joined.");
			mt3.thrd.join();
			System.out.println("Child #3 joined.");
		}catch(InterruptedException e){
			System.out.println("Main thread Interrupted.");
		}
		System.out.println("Main thread terminating.");
	}
}