public class Apartment extends House {
    boolean isolated;

    public Apartment(){};

    public Apartment(double length, double width, int floorCount, boolean isolated) {
        super(length, width, floorCount);
        this.isolated = isolated;
    }

    public void setIsolated(boolean x){
        isolated = x;
    }
}
