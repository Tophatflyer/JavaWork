class Chapter6Q3Demo{
	public static void main(String args[]){
		Chapter6Q3 stack = new Chapter6Q3(10);
		stack.push('A');
		stack.push('Z');
		stack.peek();
		stack.pop();
		stack.peek();
		stack.pop();
		stack.peek();
		System.out.println("Did not remove from stack (0): " + stack.pop());

	}
}