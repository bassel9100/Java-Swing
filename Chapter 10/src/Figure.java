public abstract class Figure {
    protected Point p;

    public Figure(){
        p = new Point(0,0);
    }

    public Figure(int x, int y){
        p = new Point(x,y);
    }

    public Figure(Point p2){
        p = new Point(p2);
    }

    public void moveTo(Point p2){
        p.x = p2.x;
        p.y = p2.y;
    }

    public abstract double area();
}
