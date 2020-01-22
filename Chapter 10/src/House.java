public class House {

    protected double length;
    protected double width;
    protected int floorCount;
    protected int lastRenovation;

    public double area(){
        return length * width * lastRenovation;
    }

    public boolean isBigger(House h){
        return area() > h.area();
    }
}
