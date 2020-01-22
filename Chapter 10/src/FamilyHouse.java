public class FamilyHouse extends Apartment {
    int houseCount;
    int lastRenovation; //   Not the same from the superclass!
    static final double rentPerM2 = 1000;

    public double countRent(){
        return rentPerM2 * area();
    }

    public void renovate(int outside, int inside){
        super.lastRenovation = outside;
        lastRenovation = inside;
    }
}