class Finalize{
	public static void main(String args []){
		int count;

		FinalizeDemo ob = new FinalizeDemo(0);

		for(count = 1; count < 1000000; count++){
			ob.generator(count);
		}
	}
}