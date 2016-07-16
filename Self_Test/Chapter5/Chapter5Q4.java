class Chapter5Q4{
	public static void main(String args[]){
		String animals[] = {"pig", "dog", "cat", "sheep", "cow", "ant"};
		String temp;
		System.out.print("Original array is:");
		for(int i = 0; i < animals.length; ++i)
			System.out.print(" " + animals[i]);
		System.out.println();

		for(int j = 0; j < animals.length; ++j)
			for(int k = animals.length-1; k > j; --k){
				if(animals[k].charAt(0) < animals[k-1].charAt(0)){
					temp = animals[k-1];
					animals[k-1] = animals[k];
					animals[k] = temp;
				}
			}
		System.out.print("Sorted array is:");
		for(int x = 0; x < animals.length; ++x)
			System.out.print(" " + animals[x]);
		System.out.println();
	}
}