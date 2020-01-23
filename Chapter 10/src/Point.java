public class Point {
    protected int x;
    protected int y;

    public Point(){
        this(0,0);
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point(Point p){
        x = p.x;
        y = p.y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void move(int dx, int dy){
        x += dx;
        y += dy;
    }

    public double distance(Point p){
        return Math.sqrt((p.x - x)*(p.x - x) + (p.y - y)*(p.y - y));
    }
}
