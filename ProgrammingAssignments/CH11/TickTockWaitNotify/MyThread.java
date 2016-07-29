class MyThread implements Runnable{
	Thread thrd;
	TickTock ttObject;

	MyThread(String name, TickTock tt){
		thrd = new Thread(this, name);
		ttObject = tt;
		thrd.start();
	}

	public void run(){

		if(thrd.getName().compareTo("Tick") == 0){
			for(int i = 0; i < 5; i++)
				ttObject.tick(true);
			ttObject.tick(false);
		}else{
			for(int i = 0; i < 5; i++)
				ttObject.tock(true);
			ttObject.tock(false);
		}
	}
}