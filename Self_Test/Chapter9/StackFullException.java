class StackFullException extends Exception{
	int size;
	StackFullException(int s){
		size = s;
	}

	public String toString(){
		return "\n stack is full. The maximum size is: " + size;
	}
}