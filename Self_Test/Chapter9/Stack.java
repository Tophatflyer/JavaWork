// 3. The complement of a queue is a stack. It uses first-in, last-out accessing and is often likened
// to a stack of plates. The first plate put on the table is the last plate used. Create a stack
// class called Stack that can hold characters. Call the methods that access the stack push( )
// and pop( ). Allow the user to specify the size of the stack when it is created. Keep all other
// members of the Stack class private. (Hint: You can use the Queue class as a model; just
// change the way the data is accessed.)

class Stack{
	private char a[];
	private int top;

	Stack(int size){
		a = new char[size];
		top = -1;
	}

	void push(char data) throws StackFullException{
		if(top == a.length-1){
			throw new StackFullException(a.length-1);
			//System.out.println("The stack is full. Sorry.");
		}else{
			a[++top] = data;
			System.out.println("Adding " + data + " to the stack.");
		}
	}

	char pop() throws StackEmptyException{
		if(top != -1)
			return a[top--];
		else
			throw new StackEmptyException();
			//return '0';
	}

	void peek(){
		if(top == -1){
			System.out.println("There is nothing in the stack to see.");
			return;
		}
		System.out.println("The value at the top of the stack is: " + a[top]);
	}
}