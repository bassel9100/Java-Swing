public class RentalApartments extends Apartment {
    int numberApartments;
    int lastRenovation;
    static final double rentPerM = 1090;

    public double calculateRent(){
        super.isolated = false;
        return area()*rentPerM;
    }
}
