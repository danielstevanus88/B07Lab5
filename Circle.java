public class Circle{

    public Point center;
    public double radius;

    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }

    public double perimeter(){
        return 2 * Math.PI * radius;
    }

    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }

    public boolean contains(Point p){
        return center.distance(p) <= radius;
    }

}