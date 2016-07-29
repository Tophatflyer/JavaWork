class TickTock{
	String state;

	synchronized void tick(boolean running){
		if(!running){
			state = "ticked";
			notify();
			return;
		}

		System.out.print("Tick ");
		state = "ticked";

		notify();

		try{
			Thread.sleep(500);
			while(!state.equals("tocked"))
				wait();
		}catch(InterruptedException e){
			System.out.println("Thread interrupted.");
		}
	}

	synchronized void tock(boolean running){
		if(!running){
			state = "tocked";
			notify();
			return;
		}	
		System.out.println("Tock");

		state = "tocked";

		notify();
		try{
			Thread.sleep(500);
			while(!state.equals("ticked"))
				wait();
		}catch(InterruptedException e){
			System.out.println("Thread interrupted.");
		}
	}
}