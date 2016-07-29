class Queue{
	public static int a[];
	int front, rear;
	Queue(int size){
		a = new int[size];
		front = 0;
		rear = 0;
	}

	synchronized void push(int data){
		if(rear == a.length-1){
			System.out.println("The queue is full, cannot add: " + data);
			return;
		}
		System.out.println("Adding: " + data);
		a[rear++] = data;
	}

	synchronized int pop(){
		if(front == rear){
			System.out.println("The queue is empty. Cannot pop.");
			return 0;
		}
		System.out.println("popping: " + a[rear]);
		return a[rear--];
	}

}