class ThreadQueue{
	public static void main(String args[]){
		Queue tq = new Queue(10);
		MyQueue mq1 = new MyQueue("Thread #1", tq);
		MyQueue mq2 = new MyQueue("Thread #2", tq);
		
		try{
			mq1.thrd.join();
			System.out.println("Joining: " + mq1.thrd.getName());
			mq2.thrd.join();
			System.out.println("Joining: " + mq2.thrd.getName());
		}catch(InterruptedException e){
			System.out.println("Main thread interrupted.");
		}
	}
}