class MyQueue implements Runnable{
	Thread thrd;
	static Queue queue;

	MyQueue(String name, Queue q){
		queue = q;
		thrd = new Thread(this, name);
		thrd.start();
	}

	public void run(){
		System.out.println(thrd.getName() + " starting.");

		for(int i = 0; i < 5; i++){
			queue.push(i);
		}
		for(int i = 0; i < 5; i++){
			queue.pop();
		}
	}
}