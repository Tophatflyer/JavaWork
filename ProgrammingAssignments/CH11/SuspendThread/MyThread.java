class MyThread implements Runnable{
	Thread thrd;

	boolean suspended;
	boolean stopped;

	MyThread(String name){
		thrd = new Thread(this, name);
		suspended = false;
		stopped = false;
		thrd.start();
	}

	public void run(){
		System.out.println(thrd.getName() + " starting.");

		try{
			for(int i = 1; i < 1000; i++){
				System.out.print(i + " ");
				if((i % 10) == 0){
					System.out.println();
					Thread.sleep(250);
				}
				synchronized(this){
					while(suspended)
						wait();
					if(stopped)
						break;
				}
			}
		}catch(InterruptedException e){
			System.out.println(thrd.getName() + " interrupted.");
		}
		System.out.println(thrd.getName() + " exiting.");
	}

	synchronized void myStop(){
		stopped = true;
		suspended = false;
		notify();
	}

	synchronized void mySuspend(){
		suspended = true;
	}

	synchronized void myResume(){
		suspended = false;
		notify();
	}
}