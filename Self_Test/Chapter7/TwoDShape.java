abstract class TwoDShape{
	private double width;
	private double height;

	TwoDShape(double w, double h){
		width = w;
		height = h;
	}

	double getWidth(){
		return width;
	}

	double getHeight(){
		return height;
	}

	void setWidth(double width){
		this.width = width;
	}

	void setHeight(double height){
		this.height = height;
	}

	abstract double area();

}