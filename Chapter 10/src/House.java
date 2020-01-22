public class House {

    protected double length;
    protected double width;
    protected int floorCount;
    protected int lastRenovation;

    public House(){};

    public House(double length, double width, int floorCount){
        this.length = length;
        this.width = width;
        this.floorCount = floorCount;
    }

    public double area(){
        return length * width * floorCount;
    }

    public boolean isBigger(House h){
        return area() > h.area();
    }
}
