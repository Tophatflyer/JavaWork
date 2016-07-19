class DynQueue implements ICharQ{
	private char q[];
	private int getloc, putloc;

	public DynQueue(int size){
		q = new char[size];
		getloc = putloc = 0;
	}

	public void put(char ch){
		if(putloc == q.length){
			char t[] = new char[q.length * 2]; //grow array size

			for(int i = 0; i < q.length; i++)
				t[i] = q[i]; //allocate the queued characters to t array as q arra is full

			q = t; //assign q reference to t
			
		}
		q[putloc++] = ch; //place character in next available slot.
	}

	public char get(){
		if(getloc == putloc){
			System.out.println(" - Queue is full.");
			return (char) 0;
		}
		return q[getloc++];
	}
}