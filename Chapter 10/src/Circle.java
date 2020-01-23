public class Circle extends Figure {
    private double radius;

    public Circle(int x, int y, double r){
        super(x,y);
        radius = r;
    }

    public Circle(Point p, double r){
        super(p);
        radius = r;
    }

    public double getRadius(){
        return radius;
    }

    public double area(){
        return Math.PI*radius*radius;
    }
}
