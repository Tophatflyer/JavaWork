class Output{
	public static void main(String args[]){
		TwoDShape x;
		Circle cir = new Circle(2.0,4.0,5.0);

		System.out.println("The area of the circle is: " + cir.area());
		System.out.println("The width is: " + cir.getWidth());
	}
}