class Chapter2Q10{
	public static void main(String args[]){
		int counter = 0;
		boolean isprime;
		for(int i = 2; i <= 100; i++){
			isprime = true;
			for(int j = 2; j <= i/j; j++) //check with every smaller value than i to see if it is divisible by any of the values. If so make it false
				if(i % j == 0){
					isprime = false;
				}
			if(isprime){
				System.out.print(i + " ");
				counter++;
			}
			if(counter == 10){
				System.out.println();
				counter = 0;
			}
		}
		System.out.println();
	}
}