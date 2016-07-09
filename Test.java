class Test{
	public static void main(String args[]){
		int num1[] = new int[10];
		int num2[] = new int[10];

		for(int i = 0; i < num1.length; i++){
			num1[i] = i;
			num2[i] = -i;
		}

		System.out.print("num2 before reference reassignment: ");
		for(int i = 0; i < num1.length; ++i)
			System.out.print(num2[i] + " ");
		System.out.println();

		num2 = num1;
		System.out.print("num2 after reference reassignment: ");
		for(int x = 0; x < num1.length; ++x)
			System.out.print(num2[x] + " ");
		System.out.println();
	}
}