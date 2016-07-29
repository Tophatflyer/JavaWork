class PriorityDemo{
	public static void main(String args[]){
		System.out.println("Main thread starting.");

		Priority mt1 = new Priority("High Priority");
		Priority mt2 = new Priority("Low Priority");
		Priority mt3 = new Priority("Medium Priority");

		mt1.thrd.setPriority(Thread.MAX_PRIORITY);
		mt2.thrd.setPriority(Thread.MIN_PRIORITY);
		mt3.thrd.setPriority(Thread.NORM_PRIORITY);


		mt1.thrd.start();
		mt2.thrd.start();
		mt3.thrd.start();

		try{
			mt1.thrd.join();
			mt2.thrd.join();
		}catch(InterruptedException e){
			System.out.println("Main thread interrupted.");
		}
		System.out.println("\nHigh priority thread counted to " + mt1.count);
		System.out.println("Low priority thread counted to " + mt2.count);
		System.out.println("Medium priority thread counted to " + mt3.count);
	}
}