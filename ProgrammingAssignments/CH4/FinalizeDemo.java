class FinalizeDemo{
	int x;
	FinalizeDemo(int i){
		x = i;
	}

	protected void finalize(){
		System.out.println("Finalizing " + x);
	}

	void generator(int i){
		FinalizeDemo o = new FinalizeDemo(i);
	}
}