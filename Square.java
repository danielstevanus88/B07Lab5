public class Square {
	Point RightCorner;
	double length;

	public Square(Point A, double length) {
		this.RightCorner = A;
		this.length = length;
	}

	public double perimeter(){
		return(4*length);
	}

	public double area(){
		return(length*length);
	}

}