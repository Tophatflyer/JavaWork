// 3. Write a program that uses an array to find the average of 10 double values. Use any 10 values you like.

class Chapter5Q3{
	public static void main(String args[]){
		double tenDoubles[] = {1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
		int sum = 0;

		for(int i = 0; i < tenDoubles.length; ++i){
			sum += (double) tenDoubles[i];
		}
		double sumAvg = sum / (double) tenDoubles.length;
		System.out.println("The average of the 10 doubles is: " + sumAvg);
	}
}