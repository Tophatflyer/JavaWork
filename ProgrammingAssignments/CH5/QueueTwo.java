

class QueueInt{
	private int num[];
	private int putloc, getloc;

	QueueInt(int size){
		num = new int[size];
		putloc = 0;
		getloc = 0;
	}

	void put(int storeNum){
		if(putloc == num.length){
			System.out.println("Queue is full");
			return;
		}
		num[putloc++] = storeNum;
	}

	int get(){
		if(putloc == getloc){
			System.out.println("Queue is empty");
			return 0;
		}
		return num[getloc++];
	}

	int length(){
		return num.length;
	}

}

class QueueTwo{
	public static void main(String args[]){
		QueueInt queue_n = new QueueInt(10);

		for(int i = 0; i < queue_n.length(); ++i){
			queue_n.put(i);
		}
		for(int i = 0; i < queue_n.length(); ++i)
			System.out.println("item in queue: " + queue_n.get());

	}
}