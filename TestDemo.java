class TestDemo{
	public static void main(String args[]){
		Test flipWord = new Test("Anteater");
		System.out.println("Original Word is: " + flipWord.word);
		System.out.print("Reversed Word is: ");
		flipWord.reverse_string(0);
		System.out.println();
	}
}