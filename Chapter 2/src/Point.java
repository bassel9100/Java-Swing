import java.util.Objects;

public class Point {
    //Instance variables
    int x;
    int y;
    //Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0,0);
    }

    public Point(Point p){
        this(p.x, p.y);
    }

    //Methods
    public void move(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setLocation(int x, int y){
        move(x, y);
    }

    public void setLocation(Point p){
        move(p.x, p.y);
    }

    public void translate(int dx, int dy){
        x += dx;
        y += dy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;
    }

}
