class Circle extends TwoDShape{
	private double radius;
	private static final double PI = 3.14159;

	Circle(double r, double w, double h){
		super(w,h);
		radius = r;
	}

	double area(){
		return PI * (radius * radius);
	}
}