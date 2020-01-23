public class Rectangle extends Figure {
    private double l, w;

    public Rectangle(double l, double w, int x, int y){
        super(x,y);
        this.l = l;
        this.w = w;
    }

    public Rectangle(double l, double w, Point p){
        super(p);
        this.l = l;
        this.w = w;
    }

    public double area(){
        return l*w;
    }
}
